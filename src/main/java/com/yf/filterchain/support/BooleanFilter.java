package com.yf.filterchain.support;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 09:52 <br/>
 */
public interface BooleanFilter<T> extends Filter<T> {

    @Override
    default void doFilter(T t, FilterChain<T> chain) {
       if(doFilter(t)){

           chain.doFilter(t);

       }
    }

    boolean doFilter(T t);
}
