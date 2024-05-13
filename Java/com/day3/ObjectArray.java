package com.day3;

import java.util.Scanner;

class Employee{
	private int eno;
	private String ename;
	
	void getData(int no, String name) {
		eno = no;
		ename = name;
	}
	
	void display() {
		System.out.println(eno);
		System.out.println(ename);
	}
}
public class ObjectArray {
	public static void main(String[] args) {
		Employee obj[] = new Employee[2];
		int no;
		String name;
		Scanner in = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			obj[i] = new Employee();
			System.out.println("Enter Employee No. ");
			no = in.nextInt();
			System.out.println("Enter Employee Name ");
			name = in.next();
			obj[i].getData(no, name);
			obj[i].display();
		}
	}
}
