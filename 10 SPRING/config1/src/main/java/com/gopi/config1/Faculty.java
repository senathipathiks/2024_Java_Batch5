package com.gopi.config1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.gopi.config1.*;

//@Component
public class Faculty {
//	@Value("123")
	int id;
//	@Value("Gopi")
	String name;


	@Autowired
	private Subject subject;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(int id, String name) {
		//super();
		this.id = id;
		this.name = name;

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

	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Facluty [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
		
}
