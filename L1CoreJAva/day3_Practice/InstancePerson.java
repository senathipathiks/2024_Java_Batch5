package com.day3_Practice;

class Person{
	
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
public class InstancePerson {

	public static void main(String[] args) {
		
		Person p = new Person("Vicky",22);
		p.display();

	}

}
