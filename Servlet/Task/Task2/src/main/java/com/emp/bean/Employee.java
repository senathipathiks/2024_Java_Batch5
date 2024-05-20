package com.emp.bean;

public class Employee {

	
	String Employee_id;
	String empname; 
	String email;
	String password;
	
	public Employee() {
		super();
	}

	public Employee(String employee_id, String empname, String email, String password) {
		super();
		Employee_id = employee_id;
		this.empname = empname;
		this.email = email;
		this.password = password;
	}

	public String getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(String employee_id) {
		Employee_id = employee_id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
