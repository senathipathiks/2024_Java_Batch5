package com.Aravind.jsp;

public class Student {
	int stuID;
	String stuName;
	String stuCity;
	public Student(int stuID, String stuName, String stuCity) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuCity = stuCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	
}
