package com.day6;

import java.util.Scanner;

class InvalidDayException extends Exception  
{  
    public InvalidDayException(String str)  
    {  
        super(str);  
    }
}

class TestDayException  
{  
  
    static void validate (int len) throws InvalidDayException{   
       if(len != 9 ){ 

        throw new InvalidDayException("Format is not valid");    
       }  
       else {
    	   System.out.println("The Format is Correct");
       }
    }
    
    static void monthValidate(int date, String month,int year)throws InvalidDayException {
    	if(0>date || date>31) {
    		throw new InvalidDayException("Date not valid");
    	}
    	else {
    		System.out.println("The Date is Correct");
    	}
    	month = month.toLowerCase();
    	if(month.equals("jan")|| month.equals("feb")|| month.equals("mar")||month.equals("apr")||month.equals("may")||month.equals("jun")||month.equals("jul")||month.equals("aug")||month.equals("sep")||month.equals("oct")||month.equals("nov")||month.equals("dec")) {
    		
    		System.out.println("The Month is Correct");
    	}
    	else {
    		throw new InvalidDayException("Month not valid");
    	}
    	if(0>year) {
    		throw new InvalidDayException("Year not valid");
    	}
    	else {
    		System.out.println("The Year is Correct");
    	}
    }
}

public class DateFormate {

	public static void main(String[] args) {
		System.out.print("Enter the Date:");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		int len = day.length();
		TestDayException obj = new TestDayException();
		try {
			obj.validate(len);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		 String[] arrOfStr = day.split("-", 3);
		 int date =Integer.parseInt(arrOfStr[0]);
		 int year =Integer.parseInt(arrOfStr[2]);
		 String month = arrOfStr[1];
		 try {
			 obj.monthValidate(date,month,year);
		 }
		 catch (Exception e) {
			 System.out.println(e);
		}

	}

}
