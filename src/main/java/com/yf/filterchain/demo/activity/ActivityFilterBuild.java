package com.yf.filterchain.demo.activity;

import com.google.common.collect.Lists;
import com.yf.filterchain.base.BaseFilter;
import com.yf.filterchain.demo.filters.GenderFilter;
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
 * @CreateDate: 2019-07-06 16:31 <br/>
 */
public class ActivityFilterBuild implements FilterBuild<ActivityContext> {


    @Override
    public List<BaseFilter<? super ActivityContext, Void>> buildFilter() {
        List<BaseFilter<? super ActivityContext, Void>> list = Lists.newArrayList();
        list.add(new StatusFilter());
        list.add(new StartEndTimeFilter());
        list.add(new GenderFilter());
        return list;
    }
}
