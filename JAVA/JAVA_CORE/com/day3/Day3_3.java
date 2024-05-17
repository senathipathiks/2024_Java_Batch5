package com.day3;
import java.util.Scanner;
class Student
{
	private int rollno;
	private String name;
	void getData(int r,String n)
	{
		System.out.println("Rollno:"+r);
		System.out.println("Name:"+n);
	}	
}
public class Day3_3 {

	public static void main(String[] args) {
		
		Student obj1 = new Student();
		int rno;
		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student no:");
		rno=sc.nextInt();
		System.out.println("Enter student name");
		sname=sc.next();
		obj1.getData(rno, sname);
	}

}
