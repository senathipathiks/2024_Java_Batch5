package com.day4;

class Vehicle1{
	void run() {
		System.out.println("Vehicle class");
	}
}

class Bike1 extends Vehicle1{
	void run() {
		System.out.println("Bike class");
	}
}
class Car1 extends Vehicle1{
	void run() {
		System.out.println("Car class");
	}
}

public class Dmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 obj1 = new Car1(); 
		obj1.run();
		obj1 = new Bike1();
		obj1.run();
		obj1 = new Vehicle1();
		obj1.run();
		

	}

}
