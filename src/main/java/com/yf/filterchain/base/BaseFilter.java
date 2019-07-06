package com.yf.filterchain.base;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 09:57 <br/>
 */
public interface BaseFilter<T,R> {
    /**
     *过滤职责
     * @param t
     * @param chain
     * @return R
     */
    R filter(T t, BaseFilterChain<T, R> chain);

}
