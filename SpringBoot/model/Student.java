package com.spring.restapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="studentReact")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobile")
	private long mobile;
	
	@Column(name="city")
	private String city;
	
	
	@Column(name="pincode")
	private long pincode;


	public Student() {
		super();
		
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


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getCity() {
		return city;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}