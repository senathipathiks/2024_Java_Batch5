package com.gopi.employee;

public class Department {
	int depid;
	String depname;
	String depmanager;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int depid, String depname, String depmanager) {
//		super();
		this.depid = depid;
		this.depname = depname;
		this.depmanager = depmanager;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getSDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getDepmanager() {
		return depmanager;
	}

	public void setDepmanager(String depmanager) {
		this.depmanager = depmanager;
	}

	@Override
	public String toString() {
		return "Department [Depd= " + depid + ", Depname= " + depname + ", manager= " + depmanager + "]";
	}
	
	
}
