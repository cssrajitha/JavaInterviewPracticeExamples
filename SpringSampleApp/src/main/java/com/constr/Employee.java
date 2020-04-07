package com.constr;

import java.util.List;
import java.util.Map;
import java.util.Set;

//Pojo class
public class Employee {

	private String name;

	private double salary;

	private int id;

	public Employee(int id) {
		System.out.println("id");
		this.id = id;
	}

	public Employee(String name) {
		System.out.println("name");
		this.name = name;
	}

	public Employee(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}

}
