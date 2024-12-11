package com.spring.faculty;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.spring.faculty.Subject;
@Component
public class Faculty {
	@Value("1010")
	int id;
	@Value("SenaPathi")
	String name;
	@Autowired
	Subject subj;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int id, String name,Subject subj) {
		super();
		this.id = id;
		this.name = name;
		this.subj=subj;
	}
	public Subject getSubj() {
		return subj;
	}
	public void setSubj(Subject subj) {
		this.subj = subj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public void disp() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Faculty ID   :"+ id);
		System.out.println("Faculty Name :"+name);
		
		
			System.out.println("");
			System.out.println("-----------------------------------------------");
			System.out.println(subj);
			System.out.println("-----------------------------------------------");
			System.out.println("----------------------------------------------------------------------------------");
		
		
			
	}
	
	
     	
}


