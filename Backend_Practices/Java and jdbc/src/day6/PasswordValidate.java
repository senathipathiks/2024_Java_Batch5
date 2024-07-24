package day6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
class InvalidPasswordException extends Exception {
	InvalidPasswordException(String msg)
	{
		super(msg);
	}
}
class Password
{
	Password(String pass) throws InvalidPasswordException
	{
		
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
                
		Pattern p = Pattern.compile(regex);
		
        if (pass==null) {
        	System.out.println("Invalid Password!");
        }
 
        Matcher m = p.matcher(pass);
 
		if(m.matches())
		{
			System.out.println("Valid Password!");
		}
		else
		{
			throw new InvalidPasswordException("Invalid Password!");
		}
	}
}
 
public class PasswordValidate {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Password :");
		try
		{
			Password pass = new Password(sc.next());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
 
	}
}
