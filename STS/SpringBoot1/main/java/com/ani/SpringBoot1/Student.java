package com.ani.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component
public class Student {
 
	@Value("123")
	private int id;
	@Value("Ani")
	private String name;
	@Autowired
	private Address address;
 
	public Student() {
		System.out.println("Object Created");
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
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


	public void display() {
		System.out.println("Student class");
		address.show();
	}
}

