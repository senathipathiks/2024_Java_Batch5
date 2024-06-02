package com.student.bean;

public class Student {
	int stdid;
	String stdname;
	int stdage;
	String dob;
	String stddep;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdid, String stdname, int stdage, String dob, String stddep) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdage = stdage;
		this.dob = dob;
		this.stddep = stddep;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdage() {
		return stdage;
	}
	public void setStdage(int stdage) {
		this.stdage = stdage;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getStddep() {
		return stddep;
	}
	public void setStddep(String stddep) {
		this.stddep = stddep;
	}
	
}
