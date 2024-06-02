package com.gopi.employee;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	int eid;
	String ename;
	
	@Autowired
	Department department;
	
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, ArrayList<Department> department) {
//		super();
		this.eid = eid;
		this.ename = ename;
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int id) {
		this.eid = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String name) {
		this.ename = name;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + "]";
	}
	


	
	
}
