package com.day4;

class Vehicle{
	void run() {
		System.out.println("Vehicle Class");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike class");
	}
}

class Car extends Vehicle{
	void run() {
		
		System.out.println("Car Class");
	}
}

public class MethodOverriding {
	
	
	public static void main(String args[]) {
		Vehicle c;
		c = new Car();//upcasting
		c.run();
		c = new Bike();
		c.run();
		c = new Vehicle();
		c.run();
		
		
	}

}
