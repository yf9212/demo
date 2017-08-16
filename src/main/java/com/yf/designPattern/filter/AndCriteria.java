package com.yf.designPattern.filter;

import java.util.List;

import com.google.common.collect.Lists;

public class AndCriteria implements Criteria{
	
	private  List<Criteria>  lists;
	
	public AndCriteria(Criteria ...criterias) {
		lists=Lists.newArrayList();
		for (Criteria persons : criterias) {
			lists.add(persons);
		}
	}
	
	
	public List<Person> metteCriteria(List<Person> persons) {
		for (Criteria criteria : lists) {
			persons=criteria.metteCriteria(persons);
		}
		return persons;
	}

}
