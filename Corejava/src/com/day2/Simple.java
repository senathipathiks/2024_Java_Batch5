package com.day2;

import java.util.Scanner;

class Emp
{
	//Instance variables;
	int rno;
	String name;

	void getdata(int rno,String ename) {
		this.rno= rno;
		this.name = ename;
	}

	void display(){
		System.out.println("Rollno:"+rno);
		System.out.println("Name:"+name);
	}
}
public class Simple {

	public static void main(String[] args) {
		int rno;
		String ename;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee No:");
		rno = sc.nextInt();
		System.out.println("Enter Employee Name:");
		ename = sc.next();
		Emp obj1 = new Emp();
		obj1.getdata(rno,ename);
		obj1.display();

	}

}
