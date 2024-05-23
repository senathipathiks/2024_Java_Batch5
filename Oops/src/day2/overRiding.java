package day2;

class TwoWheeler1 { //superclass
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
	void brandName() {
		System.out.println("each bike has its own brand name");
	}
}

class Bike1 extends TwoWheeler1 {//subclass
	void brandName() {
		super.brandName();
		System.out.println("Honda");
	}
} 

public class overRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 bike = new Bike1();
		bike.brandName();
	}

}
