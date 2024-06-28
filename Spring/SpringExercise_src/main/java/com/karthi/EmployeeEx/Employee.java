package com.karthi.EmployeeEx;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1001")
	int id;
	@Value("Vashi")
	String name;

	@Autowired
	Dept dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Dept getDept() {
		return dept;
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

	public void display() {
		System.out.println("Employee Details");
		System.out.println("Employee NAme :" + name);
		System.out.println("Employee ID   : " + id);
		System.out.println(dept);

	}
}
