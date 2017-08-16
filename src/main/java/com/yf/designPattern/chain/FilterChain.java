package com.yf.designPattern.chain;

import java.util.List;

import com.google.common.collect.Lists;

public class FilterChain {
	
	private List<Filter> filters=Lists.newArrayList(); 
	
	private int index=0;
	
	public FilterChain  addFilter(Filter filter){
		filters.add(filter);
		return this;
	}
	
	public void doFilter(){
		if(index==filters.size()){
			return;
		}
			filters.get(index++).doFilter(""+index, this);
	}
}
