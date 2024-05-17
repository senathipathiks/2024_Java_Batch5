package com.day3;
import java.util.Scanner;
class Employee
{
	int eno;
	String name;
	static int count;
	Employee(int n,String name)
	{
		this.eno=n;
		this.name=name;
	}
	static int increment()
	{
		return count++;
	}
	void display()
	{
		System.out.println(eno+":"+name);
	}
}
public class Day3_1 {

	public static void main(String[] args) {
		Employee obj1=new Employee(12217,"Ani");
		System.out.println(Employee.increment());
		obj1.display();
		Employee obj2=new Employee(12218,"Aji");
		System.out.println(Employee.increment());
		obj2.display();
		

	}

}
