package com.lms.beans;

public class Employee {
	int eid;
	String ename;
	String edes;
	String edep;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String edes, String edep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edes = edes;
		this.edep = edep;
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

	public String getEdes() {
		return edes;
	}

	public void setEdes(String edes) {
		this.edes = edes;
	}

	public String getEdep() {
		return edep;
	}

	public void setEdep(String edep) {
		this.edep = edep;
	}
	
	
	
}
