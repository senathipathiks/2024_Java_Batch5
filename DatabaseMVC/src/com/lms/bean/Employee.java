package com.lms.bean;

public class Employee {
	int empid;
	String empname;
	String empdesig;
	String empdept;
	
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
	public String getEmpdesig() {
		return empdesig;
	}
	public void setEmpdesig(String empdesig) {
		this.empdesig = empdesig;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public Employee(int empid, String empname, String empdesig, String empdept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesig = empdesig;
		this.empdept = empdept;
	}


	
}
