package com.day7;

//Multilevel Inheritance - One Super Class and Two Sub Class

//                     | 
//                     |
//                     |

class Vehicle{ //Super Class or the Parent Class
	void noOfEngine() {
		System.out.println("I have one Engine");
		}
}

class TwoWheeler2 extends Vehicle{ //Sub Class or the Children Class
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}

class Bike2 extends TwoWheeler2{ //Sub Class or the Children Class
	void brandName() {
		System.out.println("My Brand Name is Honda");
	}
}
public class MultiEx {

	public static void main(String[] args) {
		Bike2 bike = new Bike2();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();


	}

}
