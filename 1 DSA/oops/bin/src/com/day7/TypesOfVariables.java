package com.day7;

 public class TypesOfVariables {
	static int a=0;
	void myMethod1() {
		System.out.println("instent method");
		a=9;
	}
	static void myMethod2() {
		System.out.println("static method");
	}
	 public static void main(String[] args) {
		 TypesOfVariables pr = new TypesOfVariables();
		System.out.println(a);
		pr.myMethod1();
		myMethod2();

	}
	 
 }

