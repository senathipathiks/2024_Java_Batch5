package com.day7;

//Heirachical Inheritance - one Super Class and more than one Sub Class

//								|
//							|		|

class TwoWheeler3{ //Super Class or the Parent Class
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}

class Bike3 extends TwoWheeler3 { //Sub Class or the Children Class
	void brandName() {
		System.out.println("My Brand Name is Honda");
		}
}

class Scooty extends TwoWheeler3{ //Sub Class or the Children Class
	void brandName() {
		System.out.println("My Brand Name is Activa");
	}
}
public class HeirachicalEx {

	public static void main(String[] args) {
		Bike3 bike = new Bike3();
		bike.noOfWheels();
		bike.brandName();
		
		Scooty scooty = new Scooty();
		scooty.noOfWheels();
		scooty.brandName();


	}

}

