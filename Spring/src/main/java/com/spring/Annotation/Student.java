package com.spring.Annotation;


import org.springframework.beans.factory.annotation.Autowired;

import com.spring.Annotation.Address;

public class Student {
	int id;
	String name;
	@Autowired
	private Address addr;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	public void disp() {
		System.out.println("--------------------------------");
		System.out.println("Student ID   :"+ id);
		System.out.println("Student Name :"+name);
		System.out.println("Student Address :"+addr);		
		
	}
	
}
