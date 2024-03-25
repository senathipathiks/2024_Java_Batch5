package oops.day3;

class P{
	P(){
		System.out.println("p");
	}
	
	final void pri() {
		System.out.println("p - pri");
	}
}

final class C extends P{
	C(){
		System.out.println("c");
	}
	void pri1() {
		System.out.println("p - pri");
	}
}
class Cc extends C{ // final wont allow to inherit further
	void pri() { // final wont allow to override the method
		System.out.println("p - pri");
	}
	
}

public class FinalsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cc cc = new Cc();
		final int a = 10;
		a = 20; //final wont allow to update the value

	}

}
