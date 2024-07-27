package mypackage4;

//Method Overriding (or) Run time Polymorphism

class TwoWheeler
{
	void noOfWheels()
	{
		System.out.println("It has two wheels");
	}
	
	void brandName()
	{
		System.out.println("All two wheelers has its own brand name ");
	}
}

class Bike extends TwoWheeler
{
	void brandName()
	{
	//	super.brandName();
		System.out.println("My brand bike is RE ");
	}
}
public class MethodOverridingConcept 
{
	public static void main(String[] args)
	{
		Bike bike = new Bike();
		bike.brandName();
		
		TwoWheeler twowheeler = new TwoWheeler();
		twowheeler.brandName();
	}
}
