package com.day5;

abstract class Parent{
	abstract void message();
}

class Sub1 extends Parent{
	void message(){
		System.out.println("This is first class");
	}
}

class Sub2 extends Parent{
	void message() {
		System.out.println("This is second class");
	}
}
public class Test {

	public static void main(String[] args) {
		Parent p = new Sub2();
		p.message();
		p = new Sub1();
		p.message();

	}

}
