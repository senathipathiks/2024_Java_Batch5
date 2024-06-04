package com.day7;

//Dynamic Method Dispatch [DMD]

class TwoWheeler5{ //Super Class or the Parent Class
	int a = 10;
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
	
	static void brandName() {
		System.out.println("All two wheelers has its own brand name");
	}
}

class Bike5 extends TwoWheeler5{ //Sub Class or the Children Class
	int a = 20;
	void brandName1() {
		System.out.println("My Brand Name is Honda");
	}
}

public class DMD {

	public static void main(String[] args) {
		TwoWheeler5 bike = new Bike5(); //DMD
		bike.brandName();
		bike.noOfWheels();
		System.out.println(bike.a); //10

	}

}
