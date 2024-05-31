package com.day2.DependancyInjection;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	ArrayList<Address> address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public void display() {
		System.out.println("ID is: "+id);
		System.out.println("Name is: "+name);
		for(Address s : address) {
			System.out.print(s + " ");
		}
	}
}
