package com.gana.autowired;

import java.util.ArrayList;
import com.gana.autowired.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int id;
	String name;
	
	@Autowired
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
//		super();
		this.id = id;
		this.name = name;

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
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}
		
	

}