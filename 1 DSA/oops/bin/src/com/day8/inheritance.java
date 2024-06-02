package com.day8;

class vechile {
	
	void noOfEngine() {
		System.out.println("I Have An One Engine");
	}
}


//Single Inheritance
 class TwoWheeler extends vechile { //super class
	
	 
	void noOfWheels(int x)
	{
		System.out.println("I Have Two Wheels inside twowheeler");
	}
}

class bike extends TwoWheeler { //sub class
	
	void brandName() {
		System.out.println("BMW");
	}
	
	void noOfWheels()
	{
		System.out.println("I Have Two Wheels bike class");
		super.noOfWheels(4);
	}

//		void noOfWheels() {
//		System.out.println("sub class two wheels");
//	}
	
}
public class inheritance {

	public static void main(String[] args) {
		
		bike b = new bike();
		b.noOfWheels();

		
		TwoWheeler tw = new TwoWheeler();
		
	}

}
 