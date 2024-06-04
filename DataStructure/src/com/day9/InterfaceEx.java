package com.day9;

interface VehiclePlan1{
	void noOfEngine();  
}

interface VehiclePlan2{
	void noOfWheels();  
	void brandName();
}

abstract class Vehicle2 implements VehiclePlan1,VehiclePlan2{
	Vehicle2(){
		System.out.println("Vehicle");
	}
	public void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class Bike2 extends Vehicle2{
	public void noOfWheels() {
		System.out.println("I have two wheels");
	}
	
	public void brandName() {
		System.out.println("My Brand Name is Honda");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		Bike2 bike = new Bike2();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
