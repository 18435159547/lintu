package com.lintu.demo.domain;

import java.util.Date;

public class OverTime {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column overtime.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column overtime.datetime
     *
     * @mbggenerated
     */
    private Date datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column overtime.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column overtime.time
     *
     * @mbggenerated
     */
    private String time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overtime.id
     *
     * @return the value of overtime.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overtime.id
     *
     * @param id the value for overtime.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overtime.datetime
     *
     * @return the value of overtime.datetime
     *
     * @mbggenerated
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overtime.datetime
     *
     * @param datetime the value for overtime.datetime
     *
     * @mbggenerated
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overtime.user_id
     *
     * @return the value of overtime.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overtime.user_id
     *
     * @param userId the value for overtime.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overtime.time
     *
     * @return the value of overtime.time
     *
     * @mbggenerated
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overtime.time
     *
     * @param time the value for overtime.time
     *
     * @mbggenerated
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}