package com.madhan.SpringDay2;

public class Student {

	 int studid;
	 String name;
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studid, String name) {
		super();
		this.studid = studid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + "]";
	}
	
	

}
