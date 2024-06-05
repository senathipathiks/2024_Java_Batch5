package com.practiseproblem;
import java.util.*;
import java.lang.Math;
abstract class shape{
	
	abstract void area();
	abstract void perimeter();
	
}

class Rectangle extends shape{
	
	int length;
	int width;
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	void area() {
		int result = length * width;
		System.out.println("Area of rectangle : " + result);
	}
	
	void perimeter() {
		
		int result = (2 *(length+width));
		System.out.println("Perimeter of rectangle : "+result);
	}
}

class Circle extends shape{
	double radius;
	double pi = 3.14159265359;
	Circle(int radius){
		this.radius = radius;
	}
	void area() {
		System.out.println("Area of Circle : "+ pi*(Math.sqrt(radius)));
	}
	
	void perimeter() {
		System.out.println("Perimeter of Circle : "+ 2*(pi*radius));
	}
}

class Triangle extends shape{
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the b,h : ");
		int b = sc.nextInt();
		int h = sc.nextInt();
		System.out.println("Area of triangle : "+(1/2)*b*h);
	}
	
	void perimeter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Perimeter of triangle : "+(a+b+c));
	
		
	}
}
public class Shapes {
	
//	static void menu() {
//		System.out.println("1 : Area and perimeter of rectancle");
//		System.out.println("2 : Area and perimeter of Circle");
//		System.out.println("3 : Area and perimeter of Triangle");
//		
//		
//	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Shapes.menu();
		
		Rectangle r = new Rectangle(2,3);
		r.area();
		r.perimeter();
		Circle c = new Circle(10);
		c.area();
		c.perimeter();
		Triangle t = new Triangle();
		t.area();
		t.perimeter();
		
		

	}

}
