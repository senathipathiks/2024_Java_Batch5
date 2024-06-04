package com.day2;

import java.util.Scanner;

class ArrayObj{
	private int rollno;
	private String name;
	ArrayObj(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
}
	void display()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
	}
}
public class ArrayofObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayObj obj[] = new ArrayObj[5];
		
		for(int i = 0; i < 5; i++)
		{
		
		System.out.println("Enter Roll No:");
		int rollno = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		
		obj[i] = new ArrayObj(rollno,name);
		obj[i].display();
		}
		
	}
		
}




