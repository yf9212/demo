package com.yf.filterchain.support;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 10:13 <br/>
 */
public class CompositeFilter<T> extends BaseCompositeFilter<T,Void> implements Filter<T>{


    public CompositeFilter(FilterBuild<T> build) {
        super(build);
    }

    @Override
    public void doFilter(T t, FilterChain<T> chain) {
        super.filter(t,chain);
    }

}
