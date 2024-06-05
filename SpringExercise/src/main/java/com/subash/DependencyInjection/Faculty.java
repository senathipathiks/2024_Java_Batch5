package com.subash.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Faculty {

	int id;
	String name;
	String dept;
	@Autowired
	Subject subject;
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(dept);
		System.out.println(subject);
	}
	
	

}
