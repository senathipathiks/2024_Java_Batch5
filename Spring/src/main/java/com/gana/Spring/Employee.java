package com.gana.Spring;

public class Employee {
	
	int id;
	String name;
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Computer [id = "+ id +", name = "+ name +"]";
		
	}

}
