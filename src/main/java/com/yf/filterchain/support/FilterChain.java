package com.yf.filterchain.support;

import com.yf.filterchain.base.BaseFilterChain;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-05 17:54 <br/>
 */
public interface FilterChain<T>  extends BaseFilterChain<T,Void> {


    @Override
    default Void filter(T t) {
        doFilter(t);
        return null;
    }

    /**
     * 执行过滤
     * @param t
     */
    void  doFilter(T t);
}
