package com.day3;

class Emp{
	private int rollno;
	private String name;
	//static int count;
	Emp(int roll,String name){
		rollno = roll;
		this.name = name;
		
	}
	void display() {
		System.out.println("roll number:"+rollno);
		System.out.println("name:"+name);
		//count++;
	}
	
}

class Manager extends Emp{
	String dept;
	Manager(int rollno, String name, String dept){
		super(rollno,name);
		this.dept = dept;
		
	}
	void display() {
		super.display();
		System.out.println("Dept:"+dept);
		//System.out.println(Manager.count);
	}
}

public class InheritanceEg {

	public static void main(String[] args) {
		Manager m = new Manager(101,"aravind","cse");
		m.display();
	}

}
