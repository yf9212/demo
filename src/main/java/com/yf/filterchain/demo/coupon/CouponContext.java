package com.yf.filterchain.demo.coupon;

import com.google.common.base.Preconditions;
import com.yf.filterchain.demo.iterfaces.StartEndTime;
import com.yf.filterchain.demo.iterfaces.Status;

import java.util.Date;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 16:34 <br/>
 */
public class CouponContext implements StartEndTime, Status {


    private Coupon coupon;

    public CouponContext(Coupon coupon) {
        this.coupon = Preconditions.checkNotNull(coupon);
    }


    public Coupon getCoupon() {
        return coupon;
    }

    @Override
    public Date getStartTime() {
        return coupon.getStartTime();
    }

    @Override
    public Date getEndTime() {
        return coupon.getEndTIme();
    }

    @Override
    public Integer getStatus() {
        return coupon.getStatus();
    }

    @Override
    public Integer getStatusParams() {
        return 1;
    }
}
