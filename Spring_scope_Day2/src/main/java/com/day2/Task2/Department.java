package com.day2.Task2;

public class Department {
	int depid;
	String depname;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int depid, String depname) {
		super();
		this.depid = depid;
		this.depname = depname;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + "]";
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

}
