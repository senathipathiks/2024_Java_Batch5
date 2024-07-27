package mypackage3;

//Hierarchical Inheritance 

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

class Scooty extends TwoWheeler
{
	void brandName()
	{
		System.out.println("Activa");
	}
}
public class HierarchicalInheritanceConcept
{

	public static void main(String[] args)
	{
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();
		Scooty scooty = new Scooty();
		scooty.noOfWheels();
		scooty.brandName();
	}

}

