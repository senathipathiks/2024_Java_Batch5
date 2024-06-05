package com.vidhu.annotations;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.vidhu.annotations.Address;

@Component
public class StudentPojo {
	
	int id;
	String name;
	
	@Autowired
	 Address address;
	
	public StudentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentPojo(int id, String name, Address address) {
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
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "StudentPojo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
 void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		
	}
	
	
}