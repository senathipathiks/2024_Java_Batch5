package com.gpi.employee;

import java.util.ArrayList;

public class Employee {
	int eid;
	String ename;
	ArrayList<Department> department;
	
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, ArrayList<Department> department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
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
	public ArrayList<Department> getDepartment() {
		return department;
	}
	public void setDepartment(ArrayList<Department> department) {
		this.department = department;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}
	
	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		for(Department arr : department) {
			System.out.println(arr);
		}
		
	}
	
	
}
