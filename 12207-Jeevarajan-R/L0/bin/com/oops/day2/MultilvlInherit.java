package oops.day2;

//Multilevel Inheritance
class Vechile {
	void noOfEngine(){
		System.out.println("I have one Engine");
	}
}
class TwoWheeler extends Vechile{ //parent class or super class
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler{ // sub-class or child class
	void brandName() {
		System.out.println("I\'m Honda");
	}
}

public class MultilvlInherit{
	public static void main(String[] arg) {
		Bike honda = new Bike();
		System.out.println("this is example of Multi-level Inheritance ");
		System.out.println("--------------------");
		
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
	}
	
}