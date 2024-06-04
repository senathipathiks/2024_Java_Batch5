package com.day9;

abstract class Vehicle{
	Vehicle(){
		System.out.println("Vehicle");
	}
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
	abstract void noOfWheels();
	
	abstract void brandName();
}

class Bike extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
	
	void brandName() {
		System.out.println("My Brand Name is Honda");
	}
}

public abstract class AbstractionEx {

	public static void main(String[] args) {
		Vehicle vec = new Bike();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();

	}

}
