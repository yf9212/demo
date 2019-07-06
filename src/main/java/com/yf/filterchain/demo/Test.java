package com.yf.filterchain.demo;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.yf.filterchain.demo.activity.Activity;
import com.yf.filterchain.demo.activity.ActivityChain;
import com.yf.filterchain.demo.activity.ActivityContext;
import com.yf.filterchain.demo.activity.ActivityFilterBuild;
import com.yf.filterchain.demo.activity.ActivityRequest;
import com.yf.filterchain.demo.coupon.Coupon;
import com.yf.filterchain.demo.coupon.CouponChain;
import com.yf.filterchain.demo.coupon.CouponContext;
import com.yf.filterchain.demo.coupon.CouponFilterBuild;
import com.yf.filterchain.support.CompositeFilter;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 15:32 <br/>
 */
public class Test {
    public static void main(String[] args) {
        activityFilter();
        activityFilter();
        couponFilter();
    }

    private static void activityFilter(){
        List<Activity> list = Lists.newArrayList();
        list.add(new Activity(addDays(new Date(), -5), addDays(new Date(), 5), 1, "男"));
        list.add(new Activity(addDays(new Date(), -4), addDays(new Date(), 5), 1, "女"));
        list.add(new Activity(addDays(new Date(), -3), addDays(new Date(), 5), 2, "男"));
        list.add(new Activity(addDays(new Date(), -2), addDays(new Date(), 5), 2, "女"));
        ActivityRequest request = new ActivityRequest();
        request.setGender("男");
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        stopwatch.start();
        ActivityChain activityChain = new ActivityChain();
        CompositeFilter<ActivityContext> activityFilter = new CompositeFilter<>(new ActivityFilterBuild());
        list.forEach(s -> activityFilter.doFilter(new ActivityContext(s, request), activityChain));

        stopwatch.stop();
        System.out.println("耗时：" + stopwatch.elapsed(TimeUnit.MILLISECONDS ));
        System.out.println(activityChain.getList());
    }


    private static void couponFilter(){
        List<Coupon> list = Lists.newArrayList();
        list.add(new Coupon(addDays(new Date(), -5), addDays(new Date(), 5), 1));
        list.add(new Coupon(addDays(new Date(), -4), addDays(new Date(), 5), 1));
        list.add(new Coupon(addDays(new Date(), -3), addDays(new Date(), 5), 2));
        list.add(new Coupon(addDays(new Date(), -2), addDays(new Date(), 5), 2));
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        stopwatch.start();
        CouponChain couponChain = new CouponChain();
        CompositeFilter<CouponContext> activityFilter = new CompositeFilter<>(new CouponFilterBuild());
        list.forEach(s -> activityFilter.doFilter(new CouponContext(s), couponChain));

        stopwatch.stop();
        System.out.println("耗时：" + stopwatch.elapsed(TimeUnit.MILLISECONDS ));
        System.out.println(couponChain.getList());
    }

    private static Date addDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_YEAR, days);
        return c.getTime();
    }

}
