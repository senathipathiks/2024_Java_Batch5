package day4;

interface VehiclePlan{
	void noOfEngine();
	void noOfWheels();
	void brandName();
}
abstract class Vehicle implements VehiclePlan {
	
	Vehicle(){
		System.out.println("VEHICLE");
	}
	
	public void noOfEngine() {
		System.out.println("I have only one Engine");

	}
}

class Bike extends Vehicle{
	public void noOfWheels() {
		System.out.println("I have two wheels");
	}
	
	public void brandName() {
		System.out.println("HONDA");
	}
	
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiclePlan vec = new Bike();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();

	}

}
