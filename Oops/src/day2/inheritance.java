package day2;
//Single Inheritance
//class TwoWheeler  { //superclass
//	void noOfWheels() {
//		System.out.println("I have two wheels");
//	}
//}
//class Bike extends TwoWheeler {//subclass
//	void brandName() {
//		System.out.println("Honda");
//	}
//Multi-Level Inheritance
//class Vehicle {
//	void noOfEngine() {
//		System.out.println("I have only one engine");
//	}
//}
//class TwoWheeler extends Vehicle { //superclass
//	void noOfWheels() {
//		System.out.println("I have two wheels");
//	}
//}
//class Bike extends TwoWheeler {//subclass
//	void brandName() {
//		System.out.println("Honda");
//	}
//}

// Hierarchical Inheritance
class TwoWheeler  { //superclass
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler {//subclass
	void brandName() {
		System.out.println("Honda");
	}
}
class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("Activa");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		//bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
		
		Scooty scooty = new Scooty();
		scooty.noOfWheels();scooty.brandName();
	}

}