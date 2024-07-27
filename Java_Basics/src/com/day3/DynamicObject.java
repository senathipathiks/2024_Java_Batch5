package com.day3;

import java.util.Scanner;

class Student1{
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
	void display() {
		System.out.println("Roll no :"+rollno);
		System.out.println("Name: "+name);
	}
	
}

public class DynamicObject {

	public static void main(String[] args) {
		Student1 stud[] = new Student1[5];
		int rno;
		String ename;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			stud[i] = new Student1();
			System.out.println("Enter Student Number:");
			stud[i].setRollno(sc.nextInt());
			System.out.println("Enter Student Name:");
			stud[i].setName(sc.next());
			stud[i].display();
		}
	}

}
