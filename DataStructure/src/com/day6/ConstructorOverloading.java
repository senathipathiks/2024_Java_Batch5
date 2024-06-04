package com.day6;

//Constructor Overloading 
public class ConstructorOverloading {
	
	ConstructorOverloading(int a,int b) {
		System.out.println(a + b);
	}
	
	ConstructorOverloading(float a,float b) {
		System.out.println(a + b);
	}
	
	ConstructorOverloading(int a,int b,int c) {
		System.out.println(a + b + c);
	}
	
	ConstructorOverloading(double a,double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj1 = new ConstructorOverloading(20,40);
		ConstructorOverloading obj2 = new ConstructorOverloading(20,40,50);
		ConstructorOverloading obj3 = new ConstructorOverloading(20.5f,40.5f);
		ConstructorOverloading obj4 = new ConstructorOverloading(20.0d,40.0d);
	}

}
