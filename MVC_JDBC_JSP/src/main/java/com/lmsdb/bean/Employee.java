package com.lmsdb.bean;

public class Employee {
	String empid;
	String epmname;
	String empdesig;
	String empdept;

	public Employee(String empid, String epmname, String empdesig, String empdept) {
		super();
		this.empid = empid;
		this.epmname = epmname;
		this.empdesig = empdesig;
		this.empdept = empdept;
	}
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEpmname() {
		return epmname;
	}

	public void setEpmname(String epmname) {
		this.epmname = epmname;
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
