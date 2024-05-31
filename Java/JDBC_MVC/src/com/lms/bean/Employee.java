package com.lms.bean;

public class Employee {
	int eid;
	String ename;
	String epos;
	String edep;

	public Employee() {
		super();
	}
	
	
	public Employee(int eid, String ename, String epos, String edep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epos = epos;
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
	public String getEpos() {
		return epos;
	}
	public void setEpos(String epos) {
		this.epos = epos;
	}
	public String getEdep() {
		return edep;
	}
	public void setEdep(String edep) {
		this.edep = edep;
	}
	
}
