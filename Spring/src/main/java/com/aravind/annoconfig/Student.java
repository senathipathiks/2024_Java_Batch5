package com.aravind.annoconfig;



import org.springframework.beans.factory.annotation.Autowired;

public class Student { 
	int sid;
	String sname;
	
	@Autowired //injecting the dependencies
	private Address address;
	
	public Student() {
		super();

	}
	

	public Student(int sid, String sname) {
		//super();
		this.sid = sid;
		this.sname = sname;
	}

	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
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



	
	public void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(address);
		System.out.println("--------------------------------");
		
	}
	
	
	
	
	

}
