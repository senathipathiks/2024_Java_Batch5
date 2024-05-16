package com.day5;


abstract class Parent{
	abstract void message();
}
 
class Sub1 extends Parent{
	void message(){
		System.out.println(" first class");
	}
}
 
class Sub2 extends Parent{
	void message() {
		System.out.println(" second class");
	}
}
public class Task2 {
 
	public static void main(String[] args) {
		Parent p = new Sub2();
		p.message();
		p = new Sub1();
		p.message();
 
	}
 
}
 

