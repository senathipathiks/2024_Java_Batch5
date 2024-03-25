package oops.day4;

interface VehiclePlan{
	
	public abstract void noOfEngine(); //by default
	abstract void noOfWheels(); // 
	void brandName(); // in default it will be public and abstract
	
}

abstract class Vehicle implements VehiclePlan{
	Vehicle(){
		System.out.println("Vehicle");
	}
	public void noOfEngine() {
		System.out.println("1 engine");
	}
}
class Bike1 extends Vehicle{
	public void noOfEngine() {
		System.out.println("155cc");
	}
	public void noOfWheels() {
		System.out.println("2 tubeless - MRF");
	}
	
	public void brandName() {
		System.out.println("YAMAHA");
	}
	void speed() {
		System.out.println("Top speed 158kmph");
	}
}

public class InterfaceFunctions {
	public static void main(String[] ar) {
		Bike1 bk = new Bike1();
		bk.brandName();
		bk.noOfEngine();
		bk.noOfWheels();
		bk.speed();
	}

}
