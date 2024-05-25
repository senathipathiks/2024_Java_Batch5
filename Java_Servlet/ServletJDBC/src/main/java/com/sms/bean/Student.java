package com.sms.bean;

public class Student {
	private int stuid;
	private String name;
	private String city;
	private String mobile;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stuid, String name, String city, String mobile) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
