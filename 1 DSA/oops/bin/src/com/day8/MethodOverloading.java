package com.day8;

public class  MethodOverloading {

	
	
	void MethodOverloading1(int a1,int a2) {
		System.out.println(a1+a2);	
	}
	
	void MethodOverloading1(float a1,int a2) {
		System.out.println(a1+a2);
	}
	
	void MethodOverloading1(int a1,float a2) {
		System.out.println(a1+a2);
	}
	
	void MethodOverloading1(int a1,int a2,int a3) {
		System.out.println(a1+a2+a3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading p4 =new MethodOverloading();
		
	}
}
