package com.day2.Task1;

import java.util.ArrayList;

public class Student {
	int rno;
	String name;
	ArrayList<Subjects> sub;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rno, String name, ArrayList<Subjects> sub) {
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

	public ArrayList<Subjects> getSub() {
		return sub;
	}

	public void setSub(ArrayList<Subjects> sub) {
		this.sub = sub;
	}

	public void display() {
		System.out.println("ID is: "+rno);
		System.out.println("Name is: "+name);
		for(Subjects s : sub) {
			System.out.println(s);
		}
	}
		
}
