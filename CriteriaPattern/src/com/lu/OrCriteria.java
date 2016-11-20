package com.lu;

import java.util.List;

public class OrCriteria implements Criteria {
	private Criteria firstCriteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.firstCriteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/**
	 * 返回符合第一种要求，或者符合第二种要求的人
	 * 
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> persons2 = firstCriteria.meetCriteria(persons);
		List<Person> persons3 = otherCriteria.meetCriteria(persons);
		for (Person person : persons2) {
			if (!(persons3.contains(person))) {
				persons3.add(person);
			}
		}
		return persons3;
	}

}
