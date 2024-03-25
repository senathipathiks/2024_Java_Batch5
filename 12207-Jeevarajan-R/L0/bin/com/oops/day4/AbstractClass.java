package oops.day4;

abstract class Animal{
	Animal(){
		System.out.println("I\'m Animal");
	}
	void eyes() {
		System.out.println("I have 2 eyes");
	}
	abstract void color();
	abstract void legs();
}

class Lion extends Animal{
	public void color() {
		System.out.println("I\'m Golden");
	}
	void legs() {
		System.out.println("I have 4");
	}
}

class Monkey extends Animal{
	void color()
	{
		System.out.println("I\'m Brown");
	}
	void legs() {
		System.out.println("I have 2 legs");
	}
}

public class AbstractClass {
	
	public static void main(String[] arg) {
		Lion l = new Lion();
		Monkey m = new Monkey();
		m.color();
		
	}

}
