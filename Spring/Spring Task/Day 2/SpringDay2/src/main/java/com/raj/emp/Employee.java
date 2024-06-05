package com.raj.emp;

import java.util.ArrayList;




public class Employee {
	
	int empid;
	String empname;
	int salary;
	
	ArrayList<Depart>dep;
	
	
	public Employee(int empid, String empname, int salary, ArrayList<Depart> dep) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.dep = dep;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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



	public ArrayList<Depart> getDep() {
		return dep;
	}



	public void setDep(ArrayList<Depart> dep) {
		this.dep = dep;
	}



	public void display() {
		System.out.println("Employee Id : "+empid);
		System.out.println("Employee Name : "+empname);
		for(Depart i : dep) {
			System.out.print(i+" ");
			System.out.println("");
			
		}
	}
}
