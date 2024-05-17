package com.day3;
class Employee1
{
	int rollno;
	String name;
	Employee1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
	}
}
class Manager extends Employee1
{
	String name;
	String dept;
	Manager(String name,int rollno,String dept)
	{
		super(name,rollno);
		this.dept=dept;
	}
	void display()
	{
		super.display();
		System.out.println("Dept:"+dept);
	}
}  
public class Day3_6 {
	public static void main(String args[])
	{
		
		Employee1 e=new Employee1("ANI",12217);
		e.display();
		Manager m=new Manager("AJI",12217,"Software Engineer");
		m.display();
	}
}
