package com.stu.bean;

public class Student {
	String sid;
	String sname;
	String scity;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sid, String sname, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	
	
}
