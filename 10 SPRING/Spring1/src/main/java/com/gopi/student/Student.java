package com.gopi.student;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	ArrayList<Subject> subject;
	
	public Student() {
		super();
	}
	public Student(int id, String name, ArrayList<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
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
	public ArrayList<Subject> getsubject() {
		return subject;
	}
	public void setsubject(ArrayList<Subject> subject) {
		this.subject = subject;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		for(Subject arr : subject) {
			System.out.println(arr);
		}
		
	}
	
	
}
