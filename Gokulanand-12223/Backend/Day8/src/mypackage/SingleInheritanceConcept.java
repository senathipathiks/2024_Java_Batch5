package mypackage;

//Single Inheritance 

class TwoWheeler
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
public class SingleInheritanceConcept
{

	public static void main(String[] args)
	{
		Bike bike = new Bike();
		bike.brandName();
		bike.noOfWheels();

	}

}
