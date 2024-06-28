package com.karthi.SimpleSpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
	private int id;
	@Value("Karthi")
	private String name;
	
	@Autowired
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("object created");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void display() {
		System.out.println("Student Class");
		System.out.println(address);
	}
}
