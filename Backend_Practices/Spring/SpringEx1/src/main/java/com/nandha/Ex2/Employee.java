package com.nandha.Ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Value("111")
	int eId;
	
	@Value("Nandha")
	String eName;
	
	

	@Autowired
	Department dept;



	public Employee(int eId, String eName, Department dept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.dept = dept;
	}



	public int geteId() {
		return eId;
	}



	public void seteId(int eId) {
		this.eId = eId;
	}



	public String geteName() {
		return eName;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public Department getDept() {
		return dept;
	}



	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void display() {
		
		System.out.println("Employee ID: "+eId);
		System.out.println("Employee Name: "+eName);
		System.out.println("Employee Department: "+dept.getDeptName());
	}

}
