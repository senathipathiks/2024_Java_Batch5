package mypackage;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle");
	}
}
class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike Class");
	}
}
class Car extends Vehicle
{
	void run()
	{
		System.out.println("Car Class");
	}
}
public class MethodOverriding
{
	public static void main (String args[])
	{
		Vehicle obj = new Car ();
		obj.run();
		
		obj = new Bike();
		obj.run();
	}
}
