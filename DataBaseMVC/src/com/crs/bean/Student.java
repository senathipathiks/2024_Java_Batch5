package com.crs.bean;

public class Student {
	
	int studid;
	String studname;
	String department;
	int studscore;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studid,String studname,String department,int studscore) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.department = department;
		this.studscore = studscore;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudscore() {
		return studscore;
	}

	public void setStudscore(int studscore) {
		this.studscore = studscore;
	}
	
	
	


}
