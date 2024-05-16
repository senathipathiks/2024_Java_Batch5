package com.day3;

import java.util.*;

class Employee{

		// instance variable
		int eno;
		String name;
		static int count;
		Employee(int eno,String name)
			{
				this.eno=eno;
				this.name=name;
			}
		
		// static method
		static int increment() {
			return count++;
		}
		
		//instance method
		void display() {
			System.out.println(eno+":"+name);
		}
}
public class Emp {

	public static void main(String[] args) {
		
		Employee obj1=new Employee(12216,"vidhu");
		System.out.println(Employee.increment());
		obj1.display(); 
		Employee obj2=new Employee(12217,"Ani");
		System.out.println(Employee.increment());
		obj2.display();

	}

}
