package com.day4;

class Vehicle{
	
	void run() {
		System.out.println("vehicle class");
	}
	
}

class Bike extends Vehicle{
	void run() {
		System.out.println("bike class");
	}
}

class Car extends Vehicle{
	void run() {
		System.out.println("car class");
	}
}
public class MethodOveride {

	public static void main(String[] args) {
		
//		Car obj1=new Car();
//		obj1.run();
		
		//-----------
//		Vehicle obj1=new Vehicle();
//		obj1.run();

//		Vehicle obj1= new Car();
//		obj1.run();
		
//		create vehicle class object
		
		Vehicle obj1;
		obj1=new Car();
		obj1.run();
		
		obj1=new Bike();
		obj1.run();
		
		obj1=new Vehicle();
		obj1.run();
	}

}
