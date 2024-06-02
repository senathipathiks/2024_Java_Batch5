package com.day1;

public class Area {

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		double area = 3.14*(r*r);
		System.out.println("The Area of Circle is " + area);
		double perimeter = 2*(3.14*r);
		System.out.println("The perimeter of Circle is " + perimeter);
	}
}
