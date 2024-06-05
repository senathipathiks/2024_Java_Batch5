package com.raj.defaultvalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("10")
	 int sid;
	@Value("Ponraj")
	String sname;
	
	@Autowired
	private Address address;
	
	public Student() {
		super();
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



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public void display() {
		System.out.println(sid);
		System.out.println(sname);
			System.out.println(address);
		}
	
}
