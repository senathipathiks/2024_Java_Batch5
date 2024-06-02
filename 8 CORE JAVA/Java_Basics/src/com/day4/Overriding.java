package com.day4;

class Vehicle{
	void run() {
		System.out.println("Vehicle class");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike class");
	}
}
class Car extends Vehicle{
	void run() {
		System.out.println("Car class");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.run();

	}

}
