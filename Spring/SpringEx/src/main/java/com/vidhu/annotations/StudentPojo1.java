package com.vidhu.annotations;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.vidhu.annotations.Address;


@Component
public class StudentPojo1 {
	
	
		@Value("12216")
		int id;
		@Value("vidhusha")
		String name;
		
		@Autowired
		 Address address;
		
	 void display() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(address);
			
		}
		
		
	}


