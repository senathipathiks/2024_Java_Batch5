package com.spring.dependency;

import java.util.ArrayList;

public class Student {	
	int id;
	String name;
	ArrayList<Address> addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name,ArrayList<Address>addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr=addr;
	}
	public ArrayList<Address> getAddr() {
		return addr;
	}
	public void setAddr(ArrayList<Address> addr) {
		this.addr = addr;
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
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
//	}
	
	public void disp() {
		System.out.println("--------------------------------");
		System.out.println("Student ID   :"+ id);
		System.out.println("Student Name :"+name);
		
		for(Address str:addr) {
			System.out.println("Address Details :");
			System.out.println("Door NO : "+str.getNo());
			System.out.println("Street  : "+str.getSt());
			System.out.println("City    : "+str.getCity());
			System.out.println("---------------------------------");
		}
			
	}
	
	
     	
}
