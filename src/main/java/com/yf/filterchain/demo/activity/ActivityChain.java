package com.yf.filterchain.demo.activity;

import com.google.common.collect.Lists;
import com.yf.filterchain.support.FilterChain;

import java.util.List;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 16:30 <br/>
 */
public class ActivityChain implements FilterChain<ActivityContext> {

    private List<Activity> list = Lists.newArrayList();

    @Override
    public void doFilter(ActivityContext activityContext) {
        list.add(activityContext.getActivity());
    }

    public List<Activity> getList() {
        return list;
    }
}
