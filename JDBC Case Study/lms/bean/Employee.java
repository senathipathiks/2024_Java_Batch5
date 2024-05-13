package com.lms.bean;

public class Employee {
	
	int Employee_id;
	String empname; 
	String empdesig;
	String empdept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int Employee_id,String empname,String empdesig,String empdept)
	{
		this.Employee_id = Employee_id;
		this.empname = empname; 
		this.empdesig = empdesig;
		this.empdept = empdept;
	}


	public int getEmployee_id() {
		return Employee_id;
	}


	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
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
