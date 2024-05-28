package com.aravind.practice;

import java.util.ArrayList;

public class Student {
	int regno;
	String name;
	ArrayList<Subject> sub;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int regno, String name, ArrayList<Subject> sub) {
		super();
		this.regno = regno;
		this.name = name;
		this.sub = sub;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Subject> getSub() {
		return sub;
	}

	public void setSub(ArrayList<Subject> sub) {
		this.sub = sub;
	}
	
	public void display() {
		System.out.println(regno);
		System.out.println(name);
		for(Subject s : sub) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------");
		
	}
	
	

}
