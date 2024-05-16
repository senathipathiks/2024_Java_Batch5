package com.day3;
import java.util.Scanner;

class ArrayObj{
	private int rollno;
	private String name;
	ArrayObj(int n , String fname){
		rollno = n;
		name = fname;
		
	}
	void display() {
		System.out.println("Rollno ="+rollno);
		System.out.println("Name ="+name);
	}
}
public class ArrayOfObjects {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		ArrayObj a[] = new ArrayObj[5];
		
		for(int i =0; i<5; i++) {
			System.out.println("enter rollno:");
			int r = s.nextInt();
			
			System.out.println("Enter name");
			String name = s.next();
			
			a[i] = new ArrayObj(r,name);
			a[i].display();
		}
		
		
		
		
	}

}
