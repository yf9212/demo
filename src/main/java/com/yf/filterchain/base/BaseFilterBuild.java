package com.yf.filterchain.base;

import java.util.List;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-05 18:06 <br/>
 */
public interface BaseFilterBuild<T,R> {

    /**
     * 获取拦截器列表
     * @return
     */
    List<BaseFilter<? super T,R>> buildFilter();
}
