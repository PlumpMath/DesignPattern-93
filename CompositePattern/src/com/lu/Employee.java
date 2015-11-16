package com.lu;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates
				+ "]";
	}

	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	/**
	 * 增加指定的员工
	 * 
	 * @param employee
	 */
	public void add(Employee employee) {
		subordinates.add(employee);

	}

	/**
	 * 去除指定的员工
	 * 
	 * @param employee
	 */

	public void remove(Employee employee) {
		subordinates.remove(employee);

	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
}
