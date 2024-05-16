package com.day4;
class Animal{
	void bark() {
		System.out.println("Animal Barks");
	}
}
class Dog extends Animal{
	void bark() {
	System.out.println("Dog Barks");
}	
}
class Cat extends Animal{
	void bark() {
		System.out.println("Cat meow's");
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		
		Animal d;
		d=new Cat();
		d.bark();
		d=new Dog();
		d.bark();
		d=new Animal();
		d.bark();

	}
}
