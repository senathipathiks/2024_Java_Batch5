package com.day2;

class Employee2
{
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
public class Employee1 {

	public static void main(String[] args) {
		Employee2 obj1 = new Employee2();
		obj1.setName("hema");
		obj1.setRollno(121);
		System.out.println(obj1.getRollno()+":"+obj1.getName());

	}

}
