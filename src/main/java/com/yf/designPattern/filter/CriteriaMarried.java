package com.yf.designPattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMarried implements Criteria{

	public List<Person> metteCriteria(List<Person> persons) {
		List<Person> marriedPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("MARRIED")) {
				marriedPersons.add(person);
			}
		}
		return marriedPersons;
	}

}
