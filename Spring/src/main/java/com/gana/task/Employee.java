package com.gana.task;

import java.util.ArrayList;
import com.gana.component.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("123")
	int empid;
	@Value("ganapathy")
	String empname;
	
	@Autowired
	private Department Department;


	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(Department);
	}
		
	

}