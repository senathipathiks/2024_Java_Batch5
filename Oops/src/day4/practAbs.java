package day4;

interface VehiclePlan1{
	void noOfEngine();
}
	
interface VehiclePlan2{
	void noOfWheels();
	void brandName();
}
abstract class Vehicle1 implements VehiclePlan1, VehiclePlan2 {
	
	Vehicle1(){
		System.out.println("VEHICLE");
	}
	
	public void noOfEngine() {
		System.out.println("I have only one Engine");

	}
	
}

class Bike1 extends Vehicle1{
	public void noOfWheels() {
		System.out.println("I have two wheels");
	}
	
	public void brandName() {
		System.out.println("HONDA");
	}
	
}
public class practAbs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 bike = new Bike1();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}
}
