package com.yf.filterchain.base;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 10:03 <br/>
 */
public interface BaseFilterChain<T,R> {

    /**
     * 过滤结果
     * @param t
     * @return
     */
    R filter(T t);
}
