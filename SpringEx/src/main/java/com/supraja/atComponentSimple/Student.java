package com.supraja.atComponentSimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("008")
    private int id;
	
	@Value("Dhars")
    private String name;
	
	@Autowired
    private Address address;
    
	@Autowired
	private Email email;
	
	public Student(int id, String name, Address address, Email email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
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
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
    
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(email);
	}
}
