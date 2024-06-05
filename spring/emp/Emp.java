package com.ani.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	@Value("101")
	int eid;
	
	@Value("Ani")
	String ename;
	
	@Autowired
	Depart dep;

	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(dep);
	}
	
	

}
