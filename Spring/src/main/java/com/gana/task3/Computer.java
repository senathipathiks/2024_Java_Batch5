package com.gana.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	@Value("33")
	int Computerid;
	@Value("hp")
	String Computername;
	
	@Autowired
	private Spec Spec;


	public void display() {
		System.out.println("Computer Id :" +Computerid);
		System.out.println("Computer Name :" +Computername);
		System.out.println(Spec);
	}
		
	

}