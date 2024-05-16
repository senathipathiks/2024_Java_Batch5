import package com.day1;
public class Calculator {
	static float add(float a, float b) {
		return a+b;
	}
	static float sub(float a, float b) {
		return a-b;
	}
	static float mul(float a, float b) {
		return a*b;
	}
	static float div(float a, float b) {
		return a/b;
	}
 
	public static void main(String[] args) {
		float val = Float.parseFloat(args[0]);
		float val1 = Float.parseFloat(args[1]);
		System.out.print(add(val,val1));
		System.out.print(sub(val,val1));
		System.out.print(mul(val,val1));
		System.out.print(div(val,val1));
 
 
	}
 
}