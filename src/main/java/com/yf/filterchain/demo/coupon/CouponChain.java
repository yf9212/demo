package com.yf.filterchain.demo.coupon;

import com.google.common.collect.Lists;
import com.yf.filterchain.support.FilterChain;

import java.util.List;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 17:10 <br/>
 */
public class CouponChain implements FilterChain<CouponContext> {

    List<Coupon>  list= Lists.newArrayList();

    @Override
    public void doFilter(CouponContext couponContext) {
        list.add(couponContext.getCoupon());
    }

    public List<Coupon> getList() {
        return list;
    }
}
