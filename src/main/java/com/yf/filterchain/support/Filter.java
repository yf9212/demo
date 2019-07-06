package com.yf.filterchain.support;

import com.yf.filterchain.base.BaseFilter;
import com.yf.filterchain.base.BaseFilterChain;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-05 17:47 <br/>
 */
public interface Filter<T> extends BaseFilter<T,Void> {


    @Override
    default Void filter(T t, BaseFilterChain<T, Void> chain) {
        System.out.println("executeBefore:"+getClass().getSimpleName());
        doFilter(t,t1 -> chain.filter(t1));
        System.out.println("executeAfter:"+getClass().getSimpleName());
        return null;
    }

    void doFilter(T t, FilterChain<T> chain);


}
