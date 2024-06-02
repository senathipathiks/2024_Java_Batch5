package com.day10;

interface AreaPlan {
	void area(int a);
}

abstract class Shape implements AreaPlan {
	
}

class Circle extends Shape{
	public void area (int a) {
		System.out.println(a*a);
	}
}
public class AeaInterClass extends Circle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle ar = new AeaInterClass();
		ar.area(3);
	}

}
