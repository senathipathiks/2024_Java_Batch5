package com.nandha.SpringEx1;

//import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Faculty {
	
	@Value("12")
	int fId;
	
	@Value("Nandhakumaran")
	String fName;
	
	@Value("SBOA")
	String fSchool;
	
	@Autowired
	Subject subject;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Faculty(int fId, String fName, String fSchool, Subject subject) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.fSchool = fSchool;
		this.subject = subject;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfSchool() {
		return fSchool;
	}

	public void setfSchool(String fSchool) {
		this.fSchool = fSchool;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void display() {
		
		System.out.println("---Faculty Details---");
		System.out.println("Faculty ID: "+fId);
		System.out.println("Faculty Name: "+fName);
		System.out.println("Faculty School: "+fSchool);
		System.out.println(subject);
	}
	
	

}
