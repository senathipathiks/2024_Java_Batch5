package mypackage2;

//Multilevel Inheritance 

class Vehicle
{
	void noOfEngine()
	{
		System.out.println("It has one Engine");
	}		
}

class TwoWheeler extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("It has two wheels");
	}
}

class Bike extends TwoWheeler
{
	void brandName()
	{
		System.out.println("Royal Enfield");
	}
}
public class MultilevelInheritanceConcept
{

	public static void main(String[] args)
	{
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.brandName();
		bike.noOfWheels();

	}

}
