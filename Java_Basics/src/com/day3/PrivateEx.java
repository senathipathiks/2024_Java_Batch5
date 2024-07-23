package com.day3;

class Student{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class PrivateEx {

	public static void main(String[] args) {
		Student emp = new Student();
		emp.setName("Nagarjun");
		emp.setRollno(12228);
		System.out.println(emp.getRollno()+" : "+emp.getName());
	}

}
