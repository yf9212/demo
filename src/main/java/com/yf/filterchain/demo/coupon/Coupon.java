package com.yf.filterchain.demo.coupon;

import java.util.Date;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 16:35 <br/>
 */
public class Coupon {

    private Date  startTime;

    private Date endTIme;

    private Integer status;

    public Coupon(Date startTime, Date endTIme, Integer status) {
        this.startTime = startTime;
        this.endTIme = endTIme;
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTIme() {
        return endTIme;
    }

    public void setEndTIme(Date endTIme) {
        this.endTIme = endTIme;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
