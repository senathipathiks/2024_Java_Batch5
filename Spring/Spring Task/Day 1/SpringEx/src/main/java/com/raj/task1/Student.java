package com.raj.task1;

import java.util.ArrayList;

public class Student {
	 int sid;
	String sname;
	ArrayList<Subject>sub;
	
	public int getSid() {
		return sid;
	}

	public Student() {
		super();
		
	}

	public Student(int sid, String sname, ArrayList<Subject> sub) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sub = sub;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public ArrayList<Subject> getSub() {
		return sub;
	}


	public void setSub(ArrayList<Subject> sub) {
		this.sub = sub;
	}


	public void display() {
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
		for(Subject i : sub) {
			System.out.print(i+" ");
			System.out.println("");
			
		}
		System.out.println("");
	}
}
