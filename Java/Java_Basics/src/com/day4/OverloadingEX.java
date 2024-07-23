package com.day4;

public class OverloadingEX {
	public static void area(int side) {
		System.out.println(side*side);
	}
	
	public static void area(int l,int b) {
		System.out.println(l*b);
	}

	public static void main(String[] args) {
		area(6);
		area(5,2);
	}

}
