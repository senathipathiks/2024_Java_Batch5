package com.raj.task1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int empid;
	String empname;
	int salary;
	
	@Autowired
	private Depart dep;
	
	
	
	public Employee(int empid, String empname, int salary, Depart dep) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.dep = dep;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public Depart getDep() {
		return dep;
	}



	public void setDep(Depart dep) {
		this.dep = dep;
	}



	public Employee() {
		super();
		
	}



	public void display() {
		System.out.println("Employee Id : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Department : "+dep);
			
	}
}
