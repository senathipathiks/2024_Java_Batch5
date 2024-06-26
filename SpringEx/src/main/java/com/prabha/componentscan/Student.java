package com.prabha.componentscan;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("15")
	int stid;
	@Value("Prabha")
	String stname;

	@Autowired
	private Address address;

	public Student(int stid, String stname, Address address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}


	public Student() {
		super();
	}

	public void display() {

		System.out.println(stid);
		System.out.println(stname);
			System.out.println(address);


	}

}