package com.prabha.dependency;

import java.util.ArrayList;

public class Student {
	int stid;
	String stname;

	ArrayList<Address> address;

	public Student(int stid, String stname, ArrayList<Address> address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}

	public ArrayList<Address> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", address=" + address + "]";
	}



	public Student() {
		super();
	}

	public void display() {

		System.out.println(stid);
		System.out.println(stname);
		for (Address addressobj : address) {
			System.out.println(addressobj);
		}

	}

}
