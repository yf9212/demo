package com.yf.filterchain.demo.activity;

import com.google.common.base.Preconditions;
import com.yf.filterchain.demo.Test;
import com.yf.filterchain.demo.iterfaces.Gender;
import com.yf.filterchain.demo.iterfaces.StartEndTime;
import com.yf.filterchain.demo.iterfaces.Status;

import java.util.Date;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 16:27 <br/>
 */
public class ActivityContext implements Status, StartEndTime, Gender {
    private Activity activity;

    private ActivityRequest request;

    public ActivityContext(Activity activity, ActivityRequest request) {
        this.activity = Preconditions.checkNotNull(activity) ;
        this.request =Preconditions.checkNotNull(request);
    }

    public Activity getActivity() {
        return activity;
    }

    public ActivityRequest getRequest() {
        return request;
    }

    @Override
    public String getGender() {
        return activity.getGender();
    }

    @Override
    public String getGenderParam() {
        return request.getGender();
    }

    @Override
    public Date getStartTime() {
        return activity.getStartTime();
    }

    @Override
    public Date getEndTime() {
        return activity.getEndTime();
    }

    @Override
    public Integer getStatus() {
        return activity.getStatus();
    }

    @Override
    public Integer getStatusParams() {
        return 1;
    }
}
