package com.day7;

//Method Overriding or Run Time

class TwoWheeler4{ //Super Class or the Parent Class
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
	
	void brandName() {
		System.out.println("All two wheelers has its own brand name");
	}
}

class Bike4 extends TwoWheeler4{ //Sub Class or the Children Class
	void brandName() {
		super.brandName();
		System.out.println("My Brand Name is Honda");
	}
}


public class MethodOverridingEx {

	public static void main(String[] args) {
		Bike4 bike = new Bike4();
		bike.brandName();
		
	}

}
