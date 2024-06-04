package com.day9;

interface VehiclePlan{
	public abstract void noOfEngine();   //public & abstract
	void noOfWheels();
	void brandName();
}
abstract class Vehicle1 implements VehiclePlan{
	Vehicle1(){
		System.out.println("Vehicle");
	}
	public void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class Bike1 extends Vehicle1{
	public void noOfWheels() {
		System.out.println("I have two wheels");
	}
	
	public void brandName() {
		System.out.println("My Brand Name is Honda");
	}
}

public class AbstractinClassEx {

	public static void main(String[] args) {
		Vehicle1 vec = new Bike1();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();


	}

}
