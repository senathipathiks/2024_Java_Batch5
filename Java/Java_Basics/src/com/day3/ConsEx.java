package com.day3;

class Employee{
	//Instance Variables
	int eno;
	String name;
	Employee(int eno,String name){
		this.eno = eno;
		this.name = name;
	}
}

public class ConsEx {

	public static void main(String[] args) {
		Employee obj = new Employee(1,"Arjun");
		System.out.println(obj.eno);
		System.out.println(obj.name);
	}

}
