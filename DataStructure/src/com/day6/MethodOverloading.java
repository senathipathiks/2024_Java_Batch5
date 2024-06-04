package com.day6;

//Method Overloading or Compile Time Polymorphism 

public class MethodOverloading {
	
	void addition(int a,int b) {
		System.out.println(a + b);
	}
	
	void addition(float a,float b) {
		System.out.println(a + b);
	}
	
	void addition(int a,int b,int c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.addition(10, 20, 50);
		obj.addition(10, 20);
		obj.addition(10.5f, 20.5f);

	}

}
