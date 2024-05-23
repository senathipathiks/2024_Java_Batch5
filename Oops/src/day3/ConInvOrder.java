package day3;

class TwoWheeler2  { //superclass
	TwoWheeler2(int x, int s) {
		System.out.println("I have two wheels");
	}
	TwoWheeler2() {
		this(3,6);
		System.out.println("a2");
	}
}
class Bike3 extends TwoWheeler2 {//subclass
	Bike3() {
		
		System.out.println("Honda");
	}
	Bike3(int a) {
		super(4,7);
		System.out.println("rr");
	}
}

		
public class ConInvOrder extends Bike3 {
	ConInvOrder(){
		System.out.println("e");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConInvOrder bike = new ConInvOrder();
		

	}

}
