package com.raj.annotation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.raj.annotation.Address;

public class Student {
	 int sid;
	String sname;
	
	@Autowired
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.print(address);
			
	}
 }		
