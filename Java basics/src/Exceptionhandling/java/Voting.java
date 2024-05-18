package Exceptionhandling.java;

class InvalidAgeException extends Throwable
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class ElectionCommision
{
	ElectionCommision(int age) throws 
	{
		if(age<18||age>110)
			throw new 
	}
}

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ElectionCommision obj1 = new ElectionCommision(13);
		}
		catch(Throwable)

	}

}
