package com.vicky.Task1;

import java.util.ArrayList;



public class Student {
	
	int id;
	String name;
	ArrayList<Subject> subject;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public ArrayList<Subject> getSubject() {
		return subject;
	}
	public void setSubject(ArrayList<Subject> subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		for(Subject string : subject) {
		System.out.println(string);
		}
	}
}
