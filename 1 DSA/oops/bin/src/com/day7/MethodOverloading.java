package com.day7;

public class  MethodOverloading {

	
	
	MethodOverloading(int a1,int a2) {
		this(1.2f,4);
		System.out.println(a1+a2);
		
	}
	
	MethodOverloading(float a1,int a2) {
		System.out.println(a1+a2);
	}
	
	MethodOverloading(int a1,float a2) {
		System.out.println(a1+a2);
	}
	
	MethodOverloading(int a1,int a2,int a3) {
		System.out.println(a1+a2+a3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading p4 =new MethodOverloading(2,4);
		MethodOverloading p3 =new MethodOverloading(2,4.4f);
		MethodOverloading p2 =new MethodOverloading(2.5f,4);
		MethodOverloading p1 =new MethodOverloading(2,4,5);
		
	}
}
