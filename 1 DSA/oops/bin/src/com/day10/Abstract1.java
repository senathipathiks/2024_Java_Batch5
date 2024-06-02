package com.day10;

abstract class a{
	abstract void display();
	a(){
		System.out.println("a constructor");
	}
}

public class Abstract1 extends a {
	
	Abstract1() {
		// TODO Auto-generated constructor stub
		System.out.println("Abstract1 constructor");
	}
	
	 void display() {
		System.out.println("Display Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a ab = new Abstract1();
		ab.display();
	}

}
