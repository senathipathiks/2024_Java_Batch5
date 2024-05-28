package com.aravind.dependencies;

import java.util.ArrayList;

public class Student { //pojo class
	int sid;
	String sname;
	//ArrayList<String> address; //newly added
	ArrayList<Address> address;
	
	public Student() {
		super();

	}
	

	public Student(int sid, String sname, ArrayList<Address> address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	
	public ArrayList<Address> getAddress() {
		return address;
	}


	public void setAddress(ArrayList<Address> address) {
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


//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", sname=" + sname + "]";
//	}
	
	public void display() {
		System.out.println(sid);
		System.out.println(sname);
		for(Address address : address) {
			System.out.println(address);
		}
		System.out.println("--------------------------------");
		
	}
	
	
	
	
	

}
