package com.yf.filterchain.support;

import com.google.common.collect.Lists;
import com.yf.filterchain.base.BaseFilter;
import com.yf.filterchain.base.BaseFilterBuild;
import com.yf.filterchain.base.BaseFilterChain;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * All rights Reserved, Designed By HQYG <br/>
 *
 * @Copyright: Copyright(C) 2016 <br/>
 * @Company: HQYG.  <br/>
 * @author: yangfeng <br/>
 * @CreateDate: 2019-07-05 17:53 <br/>
 */
public class BaseCompositeFilter<T, R> implements BaseFilter<T, R> {

    private List<BaseFilter<? super T, R>> list;

    private InnerFilterChain<T, R> filterChain;

    public BaseCompositeFilter(BaseFilterBuild<T, R> build) {
        List<BaseFilter<? super T, R>> baseFilters = build.buildFilter();
        list = Objects.isNull(baseFilters)?Lists.newArrayList():baseFilters;
    }

    @Override
    public R filter(T t, BaseFilterChain<T, R> chain) {
        filterChain = new InnerFilterChain<>(chain, list);
        return filterChain.filter(t);
    }


    public BaseFilter<? super T, R> getLastExecuteFilter() {
        int position = filterChain.getPosition();
        return list.get(position - 1);
    }

    public String getLastExecuteFilterClassName() {
        BaseFilter<? super T, R> lastExecuteFilter = getLastExecuteFilter();
        if (Objects.isNull(lastExecuteFilter)) {
            return null;
        }
        return lastExecuteFilter.getClass().getName();
    }

    private class InnerFilterChain<T, R> implements BaseFilterChain<T, R> {

        private List<BaseFilter<? super T, R>> filters= Lists.newArrayList();


        private BaseFilterChain<T, R> chain;

        private int position = 0;


        public InnerFilterChain(BaseFilterChain<T, R> chain, List<BaseFilter<? super T, R>> filters) {
            this.chain = chain;
            Iterator<BaseFilter<? super T, R>> iterator = filters.iterator();
            while (iterator.hasNext()) {
                BaseFilter<? super T, R> next = iterator.next();
                this.filters.add(next);
            }
        }


        @Override
        public R filter(T t) {
            if (position == filters.size()) {
                return chain.filter(t);
            }

            return (R)filters.get(position++).filter(t, (BaseFilterChain)this);
        }

        public int getPosition() {
            return position;
        }
    }
}
