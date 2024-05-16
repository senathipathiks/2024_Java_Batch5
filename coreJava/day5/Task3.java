package com.day5;



abstract class Animal{
 
	protected int legs;
	protected Animal() {
	}
	
	abstract void eat();
	void show() {
		System.out.println("Legs: "+legs);
	}
 
}
 
class Spider extends Animal{
	void eat() {
		System.out.println("Spider eats web");
	}
	void bark() {
		System.out.println("Dog barks");
	}
}
 
class Cat extends Animal{
	void eat() {
		System.out.println("Cat eats rat");
	}
	void bark() {
		System.out.println("Cat meows");
	}
}
 
class Fish extends Animal{
	void eat() {
		System.out.println("Fish eats fish");
	}
	void bark() {
		System.out.println("Fish swims");
	}
}
public class Task3 {
 
	public static void main(String[] args) {
 
		Spider s = new Spider();
		s.eat();
		s.bark();
		
		Cat c = new Cat();
		c.eat();
		c.bark();
		
		Fish f = new Fish();
		f.eat();
		f.bark();
		
	}
 
}

