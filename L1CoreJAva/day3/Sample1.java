package com.day3;

import java.util.Scanner;

class Employee2{
	private int id;
	private String ename;
	
	Employee2(int id,String ename){
		this.id=id;
		this.ename=ename;
	}
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+ename);
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e[] = new Employee2[5];
		int ino;
		String name;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter the employee id");
			ino=s.nextInt();
			System.out.println("Enter the employee name");
			name=s.next();
			e[i]=new Employee2(ino,name);
			e[i].display();
		}
		
	}

}
