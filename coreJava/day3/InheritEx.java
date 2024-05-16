package com.day3;

import java.util.*;
class Employee{
	
	private int eno;
	private String name;
	static int count;
	Employee(int eno,String name)
	{
		this.eno=eno;
		this.name=name;
	
	}
	
	void display()
	{
		System.out.println("eno: "+eno);
		System.out.println("name: "+name);
	}
}
class Manager extends Employee{
	String dept;
	Manager(int eno, String name, String dept)
	{
		super(eno,name);
		this.dept=dept;
	}
	void display()
	{
		super.display();
		System.out.println("dept: "+dept);
		System.out.println(Manager.count);
			
			
		}
		
	}
	

                                                                                                                                                           
public class InheritEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
