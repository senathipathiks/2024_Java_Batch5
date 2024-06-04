package com.day3;

class Vehicle
{
	void run() {
		System.out.println("Vehicle Class");
	}
}

class Bike extends Vehicle
{
	void run() {
		System.out.println("Bike Class");
	}
}

class Car extends Vehicle
{
	void run() {
		System.out.println("Car Class");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Vehicle obj1 = new Vehicle();
		Car obj2 = new Car();
		Bike obj3 = new Bike();
		obj1.run();
		obj2.run();
		obj3.run();
		
		Vehicle obj;              // DMD
		obj = new Car();
		obj.run();
		

	}

}
