package com.yf.designPattern.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrCriteria implements Criteria {

	private List<Criteria> criteriasList;

	public OrCriteria(Criteria... criterias) {
		criteriasList = new ArrayList<Criteria>();
		for (Criteria criteria : criterias) {
			criteriasList.add(criteria);
		}
	}

	public List<Person> metteCriteria(List<Person> persons) {
		Set<Person> list=new HashSet<Person>(persons.size());
		for (Criteria criteria : criteriasList) {
			list.addAll(criteria.metteCriteria(persons));
		}
		return new ArrayList<Person>(list);
	}

}
