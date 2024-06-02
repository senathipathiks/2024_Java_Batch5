package com.gopi.Spring1;

public class Employee {
//	public static void display() {
//		System.out.println("Hello world1111");
//	}
	
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
		return "Employee [id = "+ id +", name= "+ name + "]";
	}
}
