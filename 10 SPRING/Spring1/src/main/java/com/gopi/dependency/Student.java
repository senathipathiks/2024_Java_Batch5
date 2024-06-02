package com.gopi.dependency;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	ArrayList<Address> address;
	
	public Student() {
		super();
	}
	public Student(int id, String name, ArrayList<Address> address) {
		super();
		this.id = id;
		this.name = name;
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
	public ArrayList<Address> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		for(Address arr : address) {
			System.out.println(arr);
		}
		
	}
	
	
}
