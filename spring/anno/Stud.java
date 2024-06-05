package com.ani.anno;


import org.springframework.beans.factory.annotation.Autowired;

public class Stud {
	int id;
	String name;
	
	@Autowired
	private Address address;
	
	
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
		return "Stud [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}
	
}
