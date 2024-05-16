package Day4;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class ElectionCommision
{
	ElectionCommision(int age)throws InvalidAgeException
	{
		if(age<18||age>110)
		{
			throw new InvalidAgeException("Invalid age");
		}
		else
			System.out.println("Welcome to election commission of India");
	}
	
}
public class AgeException {
	
	public static void main(String[] args)throws ClassNotFoundException {
		try
		{
			ElectionCommision obj1=new ElectionCommision(21	);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception handled successfully");
		}
		
	}

}
