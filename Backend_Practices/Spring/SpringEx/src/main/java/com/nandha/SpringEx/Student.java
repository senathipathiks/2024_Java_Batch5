package com.nandha.SpringEx;

public class Student {
	


	private String studid;
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studName=" + studName + ", studEmail=" + studEmail + ", password="
				+ password + "]";
	}

	public String getStudid() {
		return studid;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStudid(String studid) {
		this.studid = studid;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String studName;
	public Student(String studid, String studName, String studEmail, String password) {
		super();
		this.studid = studid;
		this.studName = studName;
		this.studEmail = studEmail;
		this.password = password;
	}

	private String studEmail;
	private String password;
	
public  void display() {
	
	System.out.println("Hello, welcome "+studName+"!!!");
}
}
