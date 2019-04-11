package com.lintu.demo;



import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import java.io.*;


public class JxlRead {
    public static void main(String[] args) {
        //创建workbook
        try {
            Workbook workbook=Workbook.getWorkbook(new File("C:\\Users\\wx\\Desktop\\Template二月.xls"));
            //获取第一个表格
            Sheet sheet=workbook.getSheet(0);
            //获取数据
            for (int i = 0; i < sheet.getRows(); i++) {
                for (int j = 0; j < sheet.getColumns(); j++) {
                    Cell cell=sheet.getCell(j, i);
                    System.out.print(cell.getContents()+" ");
                }
                System.out.println();
            }
        }  catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

/*
        //需要解析的Excel文件
        File file=new  File("C:\\Users\\wx\\Desktop\\Template二月.xls");
        try {
            //获取工作簿
            FileInputStream fs=FileUtils.openInputStream(file);

            HSSFWorkbook workbook=new HSSFWorkbook(fs);
            //获取第一个工作表
            HSSFSheet hs=workbook.getSheetAt(0);
            //获取Sheet的第一个行号和最后一个行号
            int last=hs.getLastRowNum();
            int first=hs.getFirstRowNum();
            //遍历获取单元格里的信息
            for (int i = first; i <last; i++) {
                HSSFRow row=hs.getRow(i);
                int firstCellNum=row.getFirstCellNum();//获取所在行的第一个行号
                int lastCellNum=row.getLastCellNum();//获取所在行的最后一个行号
                for (int j = firstCellNum; j <lastCellNum; j++) {
                    HSSFCell cell=row.getCell(j);
                    String value=cell.getStringCellValue();
                    System.out.print(value+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

    }


}
