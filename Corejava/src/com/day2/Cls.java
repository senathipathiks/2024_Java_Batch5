package com.day2;

class Employee
{
	//Instance variables;
	int eno;
	String name;
	static int count;
	Employee(int eno,String name)//parameterized constructor
	{
		this.eno= eno;
		this.name = name;
		}
	static int increment()//static method
	{
		return count++;
	}
	void display()//instance method
	{
		System.out.println(eno+":"+name);
	}
}

public class Cls {

	public static void main(String[] args) {
	
		Employee obj1 = new Employee(121,"hema");
		System.out.println (Employee.increment());
		obj1.display();
		Employee obj2 = new Employee(122,"jana");
		System.out.println (Employee.increment());
		obj2.display();
	}

}
