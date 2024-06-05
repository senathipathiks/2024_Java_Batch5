package com.ani.dependency;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	ArrayList<Address> address;
	public Student(int id, String name, ArrayList<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public ArrayList<Address> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
//		System.out.println(address);
		for(Address string:address)
		{
			System.out.println(string);
		}
	}
	
}
