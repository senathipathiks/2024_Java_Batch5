package Exceptions;

import java.util.Scanner;

class PasswordCheckException extends Exception{
	PasswordCheckException(String str){
		super(str);
	}
}
public class PasswordException {

	static void validate(String password) throws PasswordCheckException{
	            if (password.length() < 8) {
	                throw new PasswordCheckException("Invalid password");
	            }

	            boolean hasUppercase = !password.equals(password.toLowerCase());
	            boolean hasLowercase = !password.equals(password.toUpperCase());
	            boolean hasSpecialChar = password.matches(".*[^A-Za-z0-9].*");
	            boolean hasDigit = password.matches(".*\\d.*");
	            
	            if(hasUppercase && hasLowercase && hasSpecialChar || hasDigit) {
	            	System.out.println("Valid password");
	            }
	            else {
	            	throw new PasswordCheckException("Invalid password");
	            }
	        }
	
		public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Password");
		String password = sc.nextLine();
		try {
			
		   validate(password);
		}
		catch(PasswordCheckException e) {
			System.out.println(e);
		}

	}

}
