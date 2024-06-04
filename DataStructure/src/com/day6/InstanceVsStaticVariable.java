package com.day6;

//Instance Vs Object Variable

public class InstanceVsStaticVariable {
	static int a = 10;
	
	public static void main(String[] args) {
		InstanceVsStaticVariable obj1 = new InstanceVsStaticVariable();
		InstanceVsStaticVariable obj2 = new InstanceVsStaticVariable();
		
		System.out.println(obj1.a); //10
		System.out.println(obj2.a); //10
		
		obj1.a = 20;
		
		System.out.println(obj1.a); //20
		System.out.println(obj2.a); //20

	}

}
