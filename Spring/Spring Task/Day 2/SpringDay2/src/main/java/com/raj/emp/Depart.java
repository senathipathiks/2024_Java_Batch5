package com.raj.emp;

public class Depart {
	
	int deptid;
	String deptname;
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Depart [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
}
