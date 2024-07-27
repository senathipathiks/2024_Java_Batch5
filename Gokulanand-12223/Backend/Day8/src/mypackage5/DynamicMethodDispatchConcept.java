package mypackage5;

//Dynamic Method Dispatch (DMD) - It is mainly used for reducing the memory space.

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
		System.out.println("My brand bike is RE ");
	}
}
public class DynamicMethodDispatchConcept 
{
	public static void main(String[] args)
	{
		TwoWheeler bike = new Bike();
		bike.brandName();
		bike.noOfWheels();
	}
}

