package com.vasi.jsp;

public class Student {

	

	int stuId;
	String stuName;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
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
	String stuCity;
	public Student(int stuId, String stuName, String stuCity) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuCity = stuCity;
	}
	
	public Student() {
		super();
	}


}
