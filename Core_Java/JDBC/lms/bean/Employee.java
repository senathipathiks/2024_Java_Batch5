package com.lms.bean; //model

public class Employee {
	int empid;
	String empname;
	String empdesig;
	String empdet;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, String empdesig, String empdet) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesig = empdesig;
		this.empdet = empdet;
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

	public String getEmpdet() {
		return empdet;
	}

	public void setEmpdet(String empdet) {
		this.empdet = empdet;
	}

}
