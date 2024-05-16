package com.lms.bean;

public class Employee {
	int empId;
	String empname;
	String empdesig;
	String empdept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empname, String empdesig, String empdept) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empdesig = empdesig;
		this.empdept = empdept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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

}
