package Day4;

import java.util.Scanner;

class InvalidPasswordException extends Exception
{
	InvalidPasswordException(String msg)
	{
		super(msg);
	}
}

class CheckPassword
{
	CheckPassword(String pwrd)throws InvalidPasswordException
	{
		String pwrdformat="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		if(pwrd.matches(pwrdformat))
		{
			System.out.println("Password :"+pwrd);
		}
		
		else {
			throw new InvalidPasswordException("Invalid Password Format");
		}
			
	}
	
}

public class InvalidPassword {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String pwrd=sc.next();
		try {
			CheckPassword cm=new CheckPassword(pwrd);
		}
		catch(Exception e) {
			System.out.println(e);
		}  

	}

}
