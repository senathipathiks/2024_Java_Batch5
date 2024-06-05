package com.srienath.annotation3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("123")
	int sid;
	@Value("Srienath")
	String sName;

	
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
