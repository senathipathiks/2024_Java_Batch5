package com.srienath.Spring;

public class Employee {
	private int empID;
	private String empName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}



	public int getEmpID() {
		return empID;
	}



	public void setEmpID(int empID) {
		this.empID = empID;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	@Override
	public String toString() {
		return "Employee [EmpID=" + empID +", EmpName=" + empName + "]";
	}

}
