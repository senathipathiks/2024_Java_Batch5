package TaskStudtSub;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	 int sid;
	String sname;
	
	@Autowired
	private Subject sub;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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



	public Subject getSub() {
		return sub;
	}



	public void setSub(Subject sub) {
		this.sub = sub;
	}



	public void display() {
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Subject : "+sub);
		
	}
}
