package mypackage;

abstract class Vehicle
{
	Vehicle()										//Constructor
	{
		System.out.println("Vehicle");
	}
	void noOfEngine()
	{
		System.out.println("I have one Engine");
	}
	abstract void noOfWheels();
		
	abstract void brandName();
}
class Bike extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
	void brandName()
	{
		System.out.println("My brand name is Honda");
	}
}
abstract public class AbstractionConcept
{

	public static void main(String[] args)
	{
		Vehicle vehicle = new Bike();
		vehicle.noOfEngine();
		vehicle.noOfWheels();
		vehicle.brandName();
	}

}
