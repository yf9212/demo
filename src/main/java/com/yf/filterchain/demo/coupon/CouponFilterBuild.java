package com.yf.filterchain.demo.coupon;

import com.google.common.collect.Lists;
import com.yf.filterchain.base.BaseFilter;
import com.yf.filterchain.demo.Test;
import com.yf.filterchain.demo.filters.StartEndTimeFilter;
import com.yf.filterchain.demo.filters.StatusFilter;
import com.yf.filterchain.support.FilterBuild;

import java.util.List;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 16:35 <br/>
 */
public class CouponFilterBuild implements FilterBuild<CouponContext> {

    @Override
    public List<BaseFilter<? super CouponContext, Void>> buildFilter() {
        List<BaseFilter<? super CouponContext, Void>> list= Lists.newArrayList();
        list.add(new StartEndTimeFilter());
        list.add(new StatusFilter());
        return list;
    }
}
