package com.day11;

abstract class Shape{
	
	abstract double area();
	abstract double perimeter();
}

class Rectangle extends Shape{
	int l,b;
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	public double area() {
		return l*b;
	}
	public double perimeter() {
		return 2*(l+b);
	}
}

class Circle extends Shape{
	int r;
	Circle(int r){
		this.r = r;
	}
	public double area() {
		return 3.14*r*r;
	}
	public double perimeter() {
		return 2*3.14*r;
	}
}

class Triangle extends Shape{
	int a,b,h;
	Triangle(int a,int b,int h){
		this.a = a;
		this.b = b;
		this.h = h;
	}
	public double area() {
		return 0.5*b*h;
	}
	public double perimeter() {
		return a+b+h;
	}
}
public class Assignment {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(1,3);
		System.out.println("The Area of the Rectangle is " + r.area());
		System.out.println("The Perimeter of the Rectangle is " + r.perimeter());
		
		Circle c = new Circle(2);
		System.out.println("The Area of the Circle is " + c.area());
		System.out.println("The Perimeter of the Circle is " + c.perimeter());
		
		Triangle t = new Triangle(3,4,5);
		System.out.println("The Area of the Triangle is " + t.area());
		System.out.println("The Perimeter of the Triangle is " + t.perimeter());
		
	}

}
