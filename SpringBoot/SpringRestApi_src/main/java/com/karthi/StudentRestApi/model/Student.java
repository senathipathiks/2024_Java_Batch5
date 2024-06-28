package com.karthi.StudentRestApi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_fsa")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "sname")
	private String name;
	@Column(name = "smobile")
	private long mobile;
	@Column(name = "scity")
	private String city;
	@Column(name = "spincode")
	private long pincode;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, long mobile, String city, long pincode) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}
	
}
