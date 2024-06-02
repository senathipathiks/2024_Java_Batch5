package com.oops_ass;

import java.util.Scanner;

abstract class Shape1 {
	
	abstract void area();
	abstract void perimeter();
}

class Rectangle extends Shape1{
	private int l;
	private int w;
	
	public Rectangle(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}

	public void area() {
		System.out.println("Area of Rectangle is : " + l*w);
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Rectangle is : " + (l+w)*2);
	}
}

class Circle extends Shape1{
	private double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	public void area() {
		System.out.println("Area of Circle is : " + (r*r)*3.14);
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Circle is : " + (r*3.14)*2);
	}
}

class Triangle extends Shape1{
	private double x;
	private double y;
	private double h;
	private double b;
	
	public Triangle(double x,double y , double h, double b) {
		super();
		this.x = x;
		this.y = y;
		this.b = b;
		this.h = h;
	}

	public void area() {
		System.out.println("Area of Triangle is : " + (b*h)*0.5);
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Triangle is : " + (x+b+y));
	}
}

public class Shape{
	static void menu() {
		
		System.out.println("1 - Rectangle");
		System.out.println("2 - Circle");
		System.out.println("3 - Triangle");
		System.out.println("4 - Exit");
		System.out.print("Enter the choice :");
	}
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);

		String msg = ""; 
		
		
		do {
			Shape.menu();
			int choice = sc.nextInt();
			switch (choice) {
	
			case 1:
				System.out.println("Enter The Rectangle Hight, Wigth :");
				Rectangle rt = new Rectangle(sc.nextInt(),sc.nextInt());
				rt.area();
				rt.perimeter();
				break;
	
			case 2:
				System.out.println("Enter The Circle Radius :");
				Circle cr = new Circle(sc.nextDouble());
				cr.area();
				cr.perimeter();
				break;
				
	
			case 3:
				System.out.println("Enter The Triangle 1st-side, 2nd-side, higth, base :");
				Triangle tr = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
				tr.area();
				tr.perimeter();
				break;
				
			case 4:
				System.exit(0);
				
				
			}
			
			System.out.println("Do you want to continue [ YES / NO ]");
			msg = sc.next();
		}
		while(msg.equalsIgnoreCase("YES"));
		
	}
}
