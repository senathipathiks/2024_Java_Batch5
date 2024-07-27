package com.stu.bean;

public class Student 
{
	String id;
	String name;
	String city;
	
	public Student() 
	{
		super();	
	}

	public Student(String id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}

