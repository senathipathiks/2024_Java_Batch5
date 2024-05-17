package com.day3;
class Employee2
{
	int rollno;
	String name;
	static int count;
	Employee2(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		count++;
	}
}
class Manager2 extends Employee2
{
	String name;
	String dept;
	Manager2(String name,int rollno,String dept)
	{
		super(name,rollno);
		this.dept=dept;
	}
	void display()
	{
		super.display();
		System.out.println("Dept:"+dept);
//		System.out.println(manager2.count);
	}
}  
public class Day3_7 {
	public static void main(String args[])
	{
		
		Employee2 e=new Employee2("ANI",12217);
		e.display();
		Manager2 m=new Manager2("AJI",12217,"Software Engineer");
		m.display();
	}
}
