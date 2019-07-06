package com.yf.filterchain.demo.filters;

import com.yf.filterchain.demo.iterfaces.StartEndTime;
import com.yf.filterchain.support.BooleanFilter;

import java.util.Date;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 15:23 <br/>
 */
public class StartEndTimeFilter implements BooleanFilter<StartEndTime> {

    @Override
    public boolean doFilter(StartEndTime startEndTime) {
        Date date = new Date();
        Date startTime = startEndTime.getStartTime();
        Date endTime = startEndTime.getEndTime();
        return startTime.getTime() <=date.getTime() && date.getTime()<=endTime.getTime();
    }
}
