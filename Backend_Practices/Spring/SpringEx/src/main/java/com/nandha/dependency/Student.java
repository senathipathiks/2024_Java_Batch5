package com.nandha.dependency;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	@Value("2")
	int stuId;
	String stuName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	ArrayList<Address> address;
//	ArrayList<Subject> subjects;
	
	@Autowired
	 Address address;
	
	@Autowired
	 Subject subjects;
	
	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

//	public ArrayList<Address> getAddress() {
//		return address;
//	}
//
//	public void setAddress(ArrayList<Address> address) {
//		this.address = address;
//	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

//	public ArrayList<Subject> getSubjects() {
//		return subjects;
//	}
//
//	public void setSubjects(ArrayList<Subject> subjects) {
//		this.subjects = subjects;
//	}
	
	public Subject getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", address=" + address + ", subjects=" + subjects
				+ "]";
	}

//	public Student(int stuId, String stuName, ArrayList<Address> address, ArrayList<Subject> subjects) {
//		super();
//		this.stuId = stuId;
//		this.stuName = stuName;
//		this.address = address;
//		this.subjects = subjects;
//	}
	
	public Student(int stuId, String stuName, Address address, Subject subjects) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.address = address;
		this.subjects = subjects;
	}

	public void display() {
		System.out.println("------Student Details------\n");
		System.out.println("Student ID: "+stuId);
		System.out.println("Student Name: "+stuName+"\n");
		int count=0;
		
//		for(Subject sub : subjects) {
//			
//			System.out.println("Subjects : "+sub);
//			
//		}
		
		System.out.println(subjects);
//		for(Address s:address) {
//			
//			count++;
//			System.out.println("------Address "+count+" ------\n");
//			
////		System.out.println(s);
//		System.out.println("DoorNo : "+s.getDoorNo());
//		System.out.println("Street : "+s.getStreet());
//		System.out.println("Area   : "+s.getArea());
//		System.out.println("City   : "+s.getCity());
//		System.out.println("Pincode: "+s.getPinCode()+"\n");
//
//		}
		
		System.out.println(address);
	}

}
