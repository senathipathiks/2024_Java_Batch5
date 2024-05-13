package com.day4;



public class Poly {
	public static void area(int a, int b, int c = 10) {
		int ad = a+b+c;
		System.out.println(ad);
	}
	public static void area(int a, int b) {
		System.out.println((a+b));
	}
	public static void main(String[] args) {
		area(10, 20);
	}
}
