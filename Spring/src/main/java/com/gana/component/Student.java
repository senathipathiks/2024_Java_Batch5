package com.gana.component;

import java.util.ArrayList;
import com.gana.component.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("123")
	int id;
	@Value("ganapathy")
	String name;
	
	@Autowired
	private Address address;


	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}
		
	

}