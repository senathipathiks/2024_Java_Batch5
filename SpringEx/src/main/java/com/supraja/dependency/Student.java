package com.supraja.dependency;

import java.util.ArrayList;

public class Student 
{
  int id;
  String name;
  ArrayList <Address> address;
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
public Student(int id, String name, ArrayList<Address> address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public void display()
{
	System.out.println(id);
	System.out.println(name);
	for(Address Add: address)
	{
		System.out.println(Add);
	}
}
  
}
