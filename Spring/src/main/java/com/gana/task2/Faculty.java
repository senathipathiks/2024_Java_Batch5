package com.gana.task2;

import java.util.ArrayList;
import com.gana.component.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Faculty {
	@Value("123")
	int facultyid;
	@Value("ganapathy")
	String facultyname;
	
	@Autowired
	private Subject Subject;


	public void display() {
		System.out.println("Computer Id :" +facultyid);
		System.out.println("Computer Name :" +facultyname);
		System.out.println(Subject);
	}
		
	

}