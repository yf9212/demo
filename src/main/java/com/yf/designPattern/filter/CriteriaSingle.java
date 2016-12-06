package com.yf.designPattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	public List<Person> metteCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
