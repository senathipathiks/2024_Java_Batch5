package com.vicky.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("1")
	int sid;
	@Value("Vigneswaran")
	String sname;
	
	@Autowired
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(address);
	}
	
}
