package com.annotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.annotation.component.Address;
import com.annotation.component.Subject;
@Component

public class Student {
	int id;
	String name;
	
	@Autowired
	private Address addr;
	
	@Autowired
	private Subject subj;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	public Subject getSubj() {
		return subj;
	}


	public void setSubj(Subject subj) {
		this.subj = subj;
	}


	public void disp() {
		System.out.println("--------------------------------");
		System.out.println("Student ID   :"+ id);
		System.out.println("Student Name :"+name);
		System.out.println("Student Address :"+addr);	
		System.out.println("Mark Report     :"+subj);
		
	}
}
