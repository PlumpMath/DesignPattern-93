package com.lu;

import java.util.List;

public class AndCriteria implements Criteria {
	private Criteria firstCriteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.firstCriteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/**
	 * 返回既符合第一种要求，也符合第二种要求的人
	 * 
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> persons2 = firstCriteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(persons2);
	}

}
