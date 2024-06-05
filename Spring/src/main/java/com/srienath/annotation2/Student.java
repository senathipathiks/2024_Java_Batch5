package com.srienath.annotation2;


import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int sid;
	String sName;
//	ArrayList<String> address;
//	ArrayList<Address> address;
	
	@Autowired
	private Address add1;
	
	@Autowired
	private Subject sub1;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Student(int sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
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



	public void display()
	{
		System.out.println(sid);
		System.out.println(sName);
		System.out.println(add1);
		System.out.println(sub1);
	}
}
