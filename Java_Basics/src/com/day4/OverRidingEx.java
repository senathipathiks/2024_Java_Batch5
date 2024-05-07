package com.day4;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running");
	}
}

class Car extends Vehicle{
	void run() {
		System.out.println("Car is running");
	}
}
public class OverRidingEx {

	public static void main(String[] args) {
		Vehicle obj = new Car();
		obj.run();
		
		obj = new Bike();
		obj.run();
	}
}