package com.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

//Pojo class
public class Employee {

	private String name;

	private double salary;

	private int id;

	private Department dept;

	private Set<String> phoneNumbers;

	private Map<String, List<String>> worksIn;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDept() {
		return dept;
	}

	public Map<String, List<String>> getWorksIn() {
		return worksIn;
	}

	public void setWorksIn(Map<String, List<String>> worksIn) {
		this.worksIn = worksIn;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}

}
