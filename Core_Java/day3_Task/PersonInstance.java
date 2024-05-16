package com.day3_Task;


class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
		System.out.println("--------------------");
	}
}
public class PersonInstance {

	public static void main(String[] args) {
		Person p = new Person("Aravind",20);
		p.display();
		
		Person p1 = new Person("vickee",22);
		p1.display();
		

	}

}
