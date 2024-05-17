package mypackage;

abstract class Servicestation
{
	String city;
	Servicestation()
	{
		
	}
	Servicestation(String s)
	{
		city = s;
	}
	abstract void service();
}

abstract class TwoWheeler extends Servicestation
{
	TwoWheeler()
	{
		
	}
	TwoWheeler(String s)
	{
		super(s);
	}
}
abstract class FourWheeler extends Servicestation
{
	FourWheeler()
	{
		
	}
	FourWheeler(String s)
	{
		super(s);
	}
}
public class AbstractMethod 
{
	public static void main(String[] args) 
	{
		
	}

}
