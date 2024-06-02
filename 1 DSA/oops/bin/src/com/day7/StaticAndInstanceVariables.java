package com.day7;

public class StaticAndInstanceVariables {
	static int a=0; // static variable
	 
	int b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=45;
		//b=3; not possible in instance variable
		System.out.println(a);
	}

}
