package oops.day2;


//Method overriding
class Animal{
	void eyes() {
		System.out.println("I have 2 eyes");
	}
}

class Dog extends Animal{
	void eyes() {
		System.out.println("My eyes are in side to side");
	}
}

public class OverRidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eyes();

	}

}
