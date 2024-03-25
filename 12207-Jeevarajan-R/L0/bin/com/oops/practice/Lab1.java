package oops.practice;

import java.util.Scanner;

abstract class Shape{
	abstract void calArea(int len, int bth);
	abstract void calArea(double len, double bth);
	abstract void calPeri(int len, int bth);
	abstract void calPeri(int len, int bth, int side);
	abstract void calArea(double r);
	abstract void calPeri(double r);
	
}

class Rectangle extends Shape{
	void calArea(int len, int bth) {
		System.out.println(len*bth);
	}
	void calPeri(int len, int bth) {
		System.out.println(len+bth);
	}
	void calPeri(int len, int bth, int side) {
		
	}
	void calArea(double len, double bth) {
		
	}
	void calArea(double r) {
		
	}
	void calPeri(double r) {
		
	}
}
class Triangle extends Shape{
	void calArea(int len, int bth) {
	}
	void calPeri(int len, int bth) {
	}
	void calPeri(int len, int bth, int side) {
		System.out.println(len+bth+side);
		
	}
	void calArea(double len, double bth) {
		System.out.println((len*bth)/2);		
	}
	void calArea(double r) {
		
	}
	void calPeri(double r) {
		
	}
}
class Circle extends Shape{
	void calArea(int len, int bth) {
	}
	void calPeri(int len, int bth) {
	}
	void calPeri(int len, int bth, int side) {
		
	}
	void calArea(double len, double bth) {
	}
	void calArea(double r) {
		System.out.println(Math.PI*r*r);				
	}
	void calPeri(double r) {
		System.out.println(2*Math.PI*r);		
	}
}

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. Triangle");
		System.out.println("2. Rectangle");
		System.out.println("3. Circle");
		System.out.println("4. Exit");
		System.out.println("-------------------------------");
		int ch = sc.nextInt();
		switch(ch) {
			case 1:
				Triangle tr = new Triangle();
				System.out.println("to find Area press 1"); 
				System.out.println("to find Perimeter press 2");
				int ct = sc.nextInt();
				if(ct == 1) {
					System.out.println("Enter your length and breadth");
					tr.calArea(sc.nextDouble(),sc.nextDouble());		
				} else {
					System.out.println("Enter your length breadth and side");
					tr.calPeri(sc.nextInt(), sc.nextInt(), sc.nextInt());
				}
				break;
			case 2:
				Rectangle rt = new Rectangle();
				System.out.println("to find Area press 1"); 
				System.out.println("to find Perimeter press 2");
				int ct1 = sc.nextInt();
				if(ct1 == 1) {
					System.out.println("Enter your length and breadth");
					rt.calArea(sc.nextInt(), sc.nextInt());
				} else {
					System.out.println("Enter your length and breadth");
					rt.calPeri(sc.nextInt(), sc.nextInt());
				}
				break;
			case 3:
				Circle cl = new Circle();
				System.out.println("to find Area press 1"); 
				System.out.println("to find Perimeter press 2");
				int ct2 = sc.nextInt();
				if(ct2 == 1) {
					System.out.println("Enter your radius");
					cl.calArea(sc.nextDouble());
				} else {
					System.out.println("Enter your radius");
					cl.calPeri(sc.nextDouble());
				}
				break;
			default:
				break;
		}
	}

}
