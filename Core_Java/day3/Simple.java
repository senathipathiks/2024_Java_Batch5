package com.day3;

class Employee{
	//Instance variable
	int eno;
	String name;
	static int count; //class variable
	Employee(int eno, String name){ //constructor
		this.eno = eno;
		this.name = name;
	}
	static int increment() { // static method to update the static variable
		return count++;
	}
	void display() { //instance method
		System.out.println(eno+":"+name);
	}
}
public class Simple {

	public static void main(String[] args) {
		
		Employee e = new Employee(19,"aravind");
		e.display();
		System.out.println(Employee.increment());
		
		Employee e1 = new Employee(20,"vickey");
		e1.display();
		System.out.println(Employee.increment());
		
		Employee e2 = new Employee(21,"Arun");
		e2.display();
		System.out.println(Employee.increment());
		
		

	}

}
