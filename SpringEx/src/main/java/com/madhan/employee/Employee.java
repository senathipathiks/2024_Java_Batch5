package com.madhan.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	@Value("12")
	int empid;
	@Value("Rajesh")
	String empname;
//	String empdesig;
	
	@Autowired
	 Department  empdesig;

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

	public Department getEmpdesig() {
		return empdesig;
	}

	public void setEmpdesig(Department empdesig) {
		this.empdesig = empdesig;
	}

	public Employee(int empid, String empname, Department empdesig) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesig = empdesig;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdesig=" + empdesig + "]";
	}
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empdesig);
	}
	
	
	

}
