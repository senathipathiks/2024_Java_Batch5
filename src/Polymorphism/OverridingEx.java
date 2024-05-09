package Polymorphism;
class Vehicle{
	void run() {
	System.out.println("v");
	}
}
class bike extends Vehicle{
	void run() {
	System.out.println("B");
	}
}
class car extends Vehicle{
	void run() {
	System.out.println("C");
	}
}
public class OverridingEx {
public static void main(String[] args) {
	Vehicle obj;
	obj=new car();
	obj.run();
	obj=new bike();
	obj.run();
	obj=new Vehicle();
	obj.run();
	
	
}
}
