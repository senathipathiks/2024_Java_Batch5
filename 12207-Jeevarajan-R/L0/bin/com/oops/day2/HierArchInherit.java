package oops.day2;

class TwoWheeler1{ //parent class or super class
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Cycle extends TwoWheeler1{
	void brandName() {
		System.out.println("I\'m BMX");
	}
}

class Bike1 extends TwoWheeler1{ // sub-class or child class
	void brandName() {
		System.out.println("I\'m Honda");
	}
}

public class HierArchInherit {
	public static void main(String[] arg) {
		Bike1 honda = new Bike1();
		System.out.println("this is example of HierArchical Inheritance ");
		System.out.println("--------------------");
		
		Cycle bmx = new Cycle();
		bmx.noOfWheels();
		bmx.brandName();
		honda.noOfWheels();
		honda.brandName();
	}
	
}

