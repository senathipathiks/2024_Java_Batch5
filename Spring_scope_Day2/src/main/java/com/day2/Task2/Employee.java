package com.day2.Task2;

import java.util.ArrayList;

public class Employee {
	int id;
	String name;
	ArrayList<Department> dept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, ArrayList<Department> dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Department> getDept() {
		return dept;
	}

	public void setDept(ArrayList<Department> dept) {
		this.dept = dept;
	}
	
}
