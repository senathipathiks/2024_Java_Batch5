package com.day3.Try1;

import org.springframework.beans.factory.annotation.Autowired;

public class Students {
	int rno;
	String name;
	
	@Autowired
	private Subjects sub;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Students(int rno, String name, Subjects sub) {
		super();
		this.rno = rno;
		this.name = name;
		this.sub = sub;
	}


	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Subjects getSub() {
		return sub;
	}


	public void setSub(Subjects sub) {
		this.sub = sub;
	}


	public void display() {
		System.out.println("Id is: "+rno);
		System.out.println("Name is: "+name);
		System.out.println(sub);
	}
}
