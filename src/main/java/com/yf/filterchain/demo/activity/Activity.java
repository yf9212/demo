package com.yf.filterchain.demo.activity;

import java.util.Date;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 16:27 <br/>
 */
public class Activity {


    private Date endTime;

    private Date startTime;

    private Integer status;

    private String gender;

    public Activity(Date startTime, Date endTime, Integer status, String gender) {
        this.endTime = endTime;
        this.startTime = startTime;
        this.status = status;
        this.gender = gender;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Activity{" +
                "endTime=" + endTime +
                ", startTime=" + startTime +
                ", status=" + status +
                ", gender='" + gender + '\'' +
                '}';
    }
}
