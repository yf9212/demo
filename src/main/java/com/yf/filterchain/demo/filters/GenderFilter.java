package com.yf.filterchain.demo.filters;

import com.yf.filterchain.demo.iterfaces.Gender;
import com.yf.filterchain.support.BooleanFilter;

import java.util.Objects;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-06 15:32 <br/>
 */
public class GenderFilter implements BooleanFilter<Gender> {

    @Override
    public boolean doFilter(Gender gender) {
        return Objects.equals(gender.getGender(),gender.getGenderParam());
    }
}
