package com.spring.project;


import java.util.ArrayList;

public class Student {	
	int id;
	String name;
	ArrayList<Subject> subj;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name,ArrayList<Subject>subj) {
		super();
		this.id = id;
		this.name = name;
		this.subj=subj;
	}
	public ArrayList<Subject> getSubj() {
		return subj;
	}
	public void setSubj(ArrayList<Subject> subj) {
		this.subj = subj;
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

	
	public void disp() {
		System.out.println("--------------------------------------------------");
		System.out.println("Student ID   :"+ id);
		System.out.println("Student Name :"+name);
		
		for(Subject str:subj) {
			System.out.println("Mark   Report :");
			System.out.println("---------------------------------");
//			System.out.println("Door NO : "+str.getNo());
//			System.out.println("Street  : "+str.getSt());
//			System.out.println("City    : "+str.getCity());
			System.out.println(str);
			System.out.println("---------------------------------");
		}
		System.out.println("---------------------------------------------------");
			
	}
	
	
     	
}


