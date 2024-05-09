package ExceptionHandling;
import java.util.*;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg){
		super(msg);
	}
}
class ElectionCommision{
	ElectionCommision(int age)throws InvalidAgeException{
		if(age<18 || age>110)
			throw new InvalidAgeException("Invalid age");
		else
			System.out.println("Welcome");
	}
}
public class Sample3 {

	public static void main(String s[]) 
	{
		try {
			ElectionCommision obj1=new ElectionCommision(1);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
		System.out.println("Handled exception");
		}
	}

}
