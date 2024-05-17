package com.lms.bean;

public class Employee {

	int empid;
	String empname;
	String empdesg;
	int sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public Employee(int empid, String empname, String empdesg, int sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesg = empdesg;
		this.sal = sal;
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

	public String getEmpdesg() {
		return empdesg;
	}

	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}

	public int getsal() {
		return sal;
	}

	public void setsal(int sal) {
		this.sal = sal;
	}
	

}
