package com.subash.atConfigurationAndBean;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;
	@Autowired
	private Address address;
	@Autowired
	private Email email;
	public Student() {
		super();
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(email);
	}

	

	
}