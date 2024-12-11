package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.*;

class InvalidPasswordCheckerException extends Exception{
	public InvalidPasswordCheckerException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
			
		
	}
}
public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("Set a password of Length 8-16 characters :");
      String pwd = s.next();
      Boolean UpperCase  = false;
      Boolean num        = false;
      Boolean spl         = false;
     for(int i=0;i<pwd.length();i++) {
    	 if(pwd.charAt(i)>=(char)65 && pwd.charAt(i)<=90) {
    		 UpperCase=true;
    		 
    		 continue;
    	 }
    	 if(pwd.charAt(i)>=(char)48 && pwd.charAt(i)<=57) {
    		 num=true;
    		 
    		 continue;
    	 }
    	 if((pwd.charAt(i)>=(char)32 && pwd.charAt(i)<=47 ) || (pwd.charAt(i)>=58 && pwd.charAt(i)<=64)) {
    		 spl=true;
    		 
    		 continue;
    	 }   	
    	
     }

      
      try {
		if((pwd.length()>=8) && (pwd.length()<=16) && spl && UpperCase && num) {
			System.out.println("Password Set Successfully !!");
		}
		else {
			throw new InvalidPasswordCheckerException("Password doesn't satisfy the Security Guideline criteria");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	}

}
