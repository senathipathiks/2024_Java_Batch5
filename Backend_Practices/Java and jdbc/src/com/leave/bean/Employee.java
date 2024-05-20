package com.leave.bean;

public class Employee {
	
	int empid;
	String empfname;
	String emplname;
	String empemail;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpfname() {
		return empfname;
	}
	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	float salary;
	public Employee(int empid, String empfname, String emplname, String empemail,
			float salary) {
		super();
		this.empid = empid;
		this.empfname = empfname;
		this.emplname = emplname;
		this.empemail = empemail;
		this.salary = salary;
	}

}
