package com.aravind.task2;

import java.util.ArrayList;

public class Employee {
	int eid;
	String ename;
	ArrayList<Department> dept;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String ename, ArrayList<Department> dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public ArrayList<Department> getDept() {
		return dept;
	}


	public void setDept(ArrayList<Department> dept) {
		this.dept = dept;
	}

	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		for(Department d : dept) {
			System.out.println(d);
			
		}
		System.out.println("-------------------------------");
	}
	
	
	
	
	

}
