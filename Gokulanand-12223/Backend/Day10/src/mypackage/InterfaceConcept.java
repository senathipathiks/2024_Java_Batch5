package mypackage;

interface VehiclePlan
{
	void noOfEngine();

}
interface VehiclePlan1
{
	void noOfWheels();
	void brandName();
}
abstract class Vehicle1 implements VehiclePlan, VehiclePlan1
{
	Vehicle1()										//Constructor
	{
		System.out.println("Vehicle");
	}
	public void noOfEngine()
	{
		System.out.println("I have one Engine");
	}
	public abstract void noOfWheels();
		
	public abstract void brandName();
}
class Bike1 extends Vehicle1
{
	public void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
	public void brandName()
	{
		System.out.println("My brand name is Honda");
	}
}
abstract public class InterfaceConcept
{

	public static void main(String[] args)
	{
		VehiclePlan  vehicle = new Bike1();
		vehicle.noOfEngine();
		VehiclePlan1 vehicle1 = new Bike1();
		vehicle1.noOfWheels();
		vehicle1.brandName();
	}

}

