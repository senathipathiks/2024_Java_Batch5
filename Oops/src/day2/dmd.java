package day2;
// Dynamic method Dispatch

class TwoWheeler2  { //superclass
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
	void brandName() {
		System.out.println("Each vehicle has its own");
	}
}
class Bike2 extends TwoWheeler2 {//subclass
	void brandName() {
		System.out.println("Honda");
	}
}

		
public class dmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler2 bike = new Bike2();
		//bike.noOfEngine();
		bike.brandName();
		bike.noOfWheels();
		

	}

}
