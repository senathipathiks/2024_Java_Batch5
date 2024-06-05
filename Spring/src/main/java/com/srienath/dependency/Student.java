package com.srienath.dependency;

import java.util.ArrayList;

public class Student {
	int sid;
	String sName;
//	ArrayList<String> address;
	ArrayList<Address> address;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



public Student(int sid, String sName, ArrayList<Address> address) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.address = address;
	}

public int getSid() {
	return sid;
}



public void setSid(int sid) {
	this.sid = sid;
}



public String getsName() {
	return sName;
}



public void setsName(String sName) {
	this.sName = sName;
}



public ArrayList<Address> getAddress() {
	return address;
}



public void setAddress(ArrayList<Address> address) {
	this.address = address;
}


//	public Student(int sid, String sName, ArrayList<String> address) {
//		super();
//		this.sid = sid;
//		this.sName = sName;
//		this.address = address;
//	}
//
//
//
//	public int getSid() {
//		return sid;
//	}
//
//
//
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//
//
//
//	public String getsName() {
//		return sName;
//	}
//
//
//
//	public void setsName(String sName) {
//		this.sName = sName;
//	}
//
//
//
//	public ArrayList<String> getAddress() {
//		return address;
//	}
//
//
//
//	public void setAddress(ArrayList<String> address) {
//		this.address = address;
//	}





	//	public void display()
//	{
//		System.out.println(sid);
//		System.out.println(sName);
//		for(String s:address) {
//			System.out.println(s);
//		}
//	}
	public void display()
	{
		System.out.println(sid);
		System.out.println(sName);
		for(Address s:address) {
			System.out.println(s);
		}
	}
}
