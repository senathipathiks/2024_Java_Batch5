package com.ani.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Stud1 {
	@Value("12")
	int id;
	@Value("ANI")
	String name;
	
	@Autowired
	Address address;
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}

}
