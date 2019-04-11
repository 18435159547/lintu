package com.lintu.demo;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcel {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\wx\\Desktop\\Template二月.xls");
        try {
            Workbook wb = WorkbookFactory.create(file);//载入excel
            Sheet sheet = wb.getSheet("考勤记录表");//获取考勤记录工作表
            int rowCount = sheet.getPhysicalNumberOfRows();//行数
            int cellCount = 0;
            String uName = "";
            for(int i=2; i<rowCount;i++) {
                System.out.println("-----------------------------------------------------");
                Row row = sheet.getRow(i);
                if(i==2) {//当前行存储打卡日期
                    String time = row.getCell(i).getStringCellValue();
                    System.out.println("| 时间: "+time+"                           ");
                    cellCount = Integer.parseInt(time.substring(time.length()-2, time.length()));//从本月结束日期截取本月天数
                }
                if(i<=3) continue;
                if(i>3 && i%2==0) {//姓名
                    uName = row.getCell(10).getStringCellValue();
                    System.out.println("\n"+uName);
                }else {
                    double totalTimeForMonth=0;
                    List<String> errorDay = new ArrayList<String>();//异常日
                    for(int j=0;j<cellCount;j++) {
                        Cell cell = row.getCell(j);
                        if(cell.getCellTypeEnum() == CellType.STRING) {
                            System.out.println("++++++++++++++++++++++++++++");
                            String value = cell.getStringCellValue();
                            System.out.println(j+1+"号: "+value);
                            List<String> time = TestExcel.timeStrToList(value);
                            if(time.size()%2!=0) {
                                System.out.println("时间异常，请检查！"+time.toString());
                                errorDay.add((j+1)+"号");
                                continue;
                            }
                            System.out.println("---------------------------------------------");
                            double totalTime = 0;
                            for(int t=0;t<time.size();t+=2) {
                                System.out.print("上班时间: "+time.get(t));
                                System.out.print("下班时间: "+time.get(t+1));
                                double tempTime = TestExcel.calcTime(time.get(t), time.get(t+1));
                                System.out.println("时长: "+tempTime);
                                totalTime = totalTime + tempTime;
                            }
                            System.out.println("【"+uName+"】："+(j+1)+"号共上班 【"+totalTime+"】小时");
                            totalTimeForMonth = totalTimeForMonth + totalTime;
                        }
                    }
                    System.out.println("【"+uName+"】：本月共上班 【"+totalTimeForMonth+"】小时");
                    if(errorDay.size()>0) {
                        System.out.println("打卡异常共计"+errorDay.size()+"天未累加，分别为："+errorDay.toString());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (EncryptedDocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * 将时间串转换为数组列表
     * @param s
     * @return
     */
    public static List<String> timeStrToList(String s) {
        int l = s.length();
        List<String> time = new ArrayList<String>();
        for(int i=0;i<l/5;i++) {
            //System.out.println(s.substring(i*5, (i+1)*5));
            time.add(i, s.substring(i*5, (i+1)*5)) ;
        }
        TestExcel.removeDuplicate(time);//去重
        return time;
    }

    /**
     * 递归去除重复打卡时间
     * @param timeArr
     */
    public static void removeDuplicate(List<String> timeArr) {
        String before = null;
        boolean flag = false;
        for(int i=0;i<timeArr.size();i++) {
            if(null==before) {
                before = timeArr.get(i);
                continue;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            try {
                Date beginTime = sdf.parse(before);
                Date endTime = sdf.parse(timeArr.get(i));
                if( (endTime.getTime() - beginTime.getTime())/(1000*60)<10) {//10分钟之内为重复打卡
                    timeArr.remove(i-1);//重复保留当前时间，移除上次打卡时间
                    flag = true;
                    break;
                }
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            before=timeArr.get(i);//当前时间作为下一次的开始时间
        }
        if(flag) {//找到重复打卡>继续去重
            TestExcel.removeDuplicate(timeArr);
        }
    }

    /**
     * 计算每个班的时间（超出半小时按半小时算，不足半小时直接忽略）
     * @param begin 上班时间
     * @param end 下班时间
     * @return
     */
    public static double calcTime(String begin, String end) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date beginTime = sdf.parse(begin);
            Date endTime = sdf.parse(end);
            double tt = (endTime.getTime() - beginTime.getTime())/(1000*60);
            if(tt/60-(long)(tt/60)>=0.5) {
                return (long)(tt/60)+0.5;
            }else {
                return (long)(tt/60);
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

}

