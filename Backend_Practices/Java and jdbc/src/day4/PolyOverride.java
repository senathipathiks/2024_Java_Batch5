package day4;

class Vehicle{
	void run() {
		System.out.println("Vehicle Class");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike Class");
	}
}

class Car extends Vehicle{
	void run() {
		System.out.println("Car Class");
	}
}


public class PolyOverride {

	public static void main(String[] args) {

		Vehicle obj;
		
		obj = new Vehicle();
		obj.run();
		obj = new Bike();
		obj.run();
		obj = new Car();
		obj.run();
		
	}

}
