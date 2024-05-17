package com.day3;
import java.util.Scanner;
class Student1
{
	private int rollno;
	private String name;
	void getData(int r,String n)
	{
		System.out.println("Rollno:"+r);
		System.out.println("Name:"+n);
	}	
}
public class Day3_4 {

	public static void main(String[] args) {
		
		Student1 obj1[] = new Student1[5];
		int rno;
		String sname;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			obj1[i]=new Student1();
			System.out.println("Enter student no:");
			rno=sc.nextInt();
			System.out.println("Enter student name");
			sname=sc.next();
			obj1[i].getData(rno, sname);
		}
		
	}

}
