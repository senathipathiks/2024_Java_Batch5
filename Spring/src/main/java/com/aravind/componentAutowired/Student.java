package com.aravind.componentAutowired;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student { 
	@Value("101")
	int sid;
	
	@Value("Aravind")
	String sname;
	
	@Autowired //injecting the dependencies
	private Address address;

	
	public void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(address);
		System.out.println("--------------------------------");
		
	}
	
	
	
	
	

}
