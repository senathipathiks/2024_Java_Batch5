package com.madhan.dependency;

import java.util.ArrayList;

public class Student {

	int sid;
	String sname;
 	ArrayList<Address> address;
 	
 	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sid, String sname, ArrayList<Address> address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public ArrayList<Address> getAddress() {
		return address;
	}


	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	
	public void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		for(Address address: address) {
			System.out.println(address);
		}
	}
	
}
