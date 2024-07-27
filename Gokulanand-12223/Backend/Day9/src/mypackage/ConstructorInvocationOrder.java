package mypackage;

//Constructor Invocation Order

class TwoWheeler
{
	TwoWheeler()
	{
		System.out.println("A");
	}
	TwoWheeler(int a)
	{
		System.out.println("A1");
	}
}
class Bike extends TwoWheeler
{
	Bike()
	{
		System.out.println("B");
	}
	Bike(int a)
	{
		this();
		System.out.println("B1");
	}
}
public class ConstructorInvocationOrder
{
	public static void main(String[] args)
	{
		Bike bike = new Bike(2);
	}

}
