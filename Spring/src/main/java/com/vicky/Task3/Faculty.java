package com.vicky.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Faculty {
	
	int fid;
	String name;
	
	@Autowired
	private Subject subject;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Faculty(int fid, String name, Subject subject) {
		super();
		this.fid = fid;
		this.name = name;
		this.subject = subject;
	}


	public int getFid() {
		return fid;
	}


	public void setFid(int fid) {
		this.fid = fid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public void display() {
		System.out.println(fid);
		System.out.println(name);
		System.out.println(subject);
	}
}
