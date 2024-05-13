package com.day1;

public class Employee {
	private int emp_id;
	private String name;
	private Double salary;
	private int dno;

	public Employee() {
		super();
	}

	public Employee(int emp_id, String name, Double salary, int dno) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.dno = dno;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}
	public void display() {
		System.out.println("Employee Id: "+emp_id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Dept No: "+dno);
		System.out.println("------------------------------");
	}
}
