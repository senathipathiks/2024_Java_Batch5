package com.day6;

import java.util.Scanner;

class InvalidPasswordException extends Exception  
{  
    public InvalidPasswordException(String str)  
    {  
        super(str);  
    }
}

class TestPasswordException  
{  
  
    static void validate (String pass) throws InvalidPasswordException{
       if(pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$")){ 
      	   System.out.println("The Password Format is Correct");
       }  
       else {
    	   throw new InvalidPasswordException("Password Format is not valid");
       }
    }
}

public class Password {

	public static void main(String[] args) {
		System.out.println("Enter the password:");
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
		TestPasswordException obj1 = new TestPasswordException();
		try {
			obj1.validate(pass);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
