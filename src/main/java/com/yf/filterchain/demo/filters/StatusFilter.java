package com.yf.filterchain.demo.filters;

import com.yf.filterchain.demo.iterfaces.Status;
import com.yf.filterchain.support.BooleanFilter;

import java.util.Objects;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 15:26 <br/>
 */
public class StatusFilter implements BooleanFilter<Status> {

    @Override
    public boolean doFilter(Status status) {
        return Objects.equals(status.getStatusParams(),status.getStatus());
    }
}
