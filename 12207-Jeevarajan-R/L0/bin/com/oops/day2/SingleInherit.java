package oops.day2;


//single Inheritance

class TwoWheeler{ //parent class or super class
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler{ // sub-class or child class
	void brandName() {
		System.out.println("I\'m Honda");
	}
}

public class SingleInherit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike honda = new Bike();
		System.out.println("this is example of Single Inheritance ");
		System.out.println("--------------------");
		
		honda.noOfWheels();
		honda.brandName();

	}

}
