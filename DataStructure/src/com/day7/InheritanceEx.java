package com.day7;

//Single Inheritance - One Super Class and one Sub Class

//						|
//						|

class TwoWheeler{ //Super Class or the Parent Class
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}

class Bike extends TwoWheeler{ //Sub Class or the Children Class
	void brandName() {
		System.out.println("My Brand Name is Honda");
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();

	}

}
