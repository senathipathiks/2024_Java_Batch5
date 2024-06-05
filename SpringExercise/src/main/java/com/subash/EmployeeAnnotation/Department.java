package com.subash.EmployeeAnnotation;

public class Department {
	
	String dept;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String dept) {
		super();
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Department [dept=" + dept + "]";
	}
	
	
}
