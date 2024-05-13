package com.day6;

import java.util.Scanner;

class InvalidFormatException extends Throwable{
	InvalidFormatException(String msg){
		super(msg);
	}
}
 
class DobCheck{
	DobCheck(String dob) throws InvalidFormatException{
		String splitted[] = dob.split("-");
		
		String date = splitted[0];
		int date_len = splitted[0].length();
		
		String month = splitted[1];
		int month_len = splitted[1].length();
		
		String year = splitted[2];
		int year_length = splitted[2].length();
		
		if(date_len == 2 && month_len == 3 && year_length == 4) {
			
			if(month.equalsIgnoreCase("JAN") ||month.equalsIgnoreCase("FEB") || month.equalsIgnoreCase("MAR") || month.equalsIgnoreCase("APR") || month.equalsIgnoreCase("MAY") || month.equalsIgnoreCase("JUN") || month.equalsIgnoreCase("JUL") || month.equalsIgnoreCase("AUG") || month.equalsIgnoreCase("SEP") || month.equalsIgnoreCase("OCT") || month.equalsIgnoreCase("NOV") || month.equalsIgnoreCase("DEC")) {
				System.out.println("Valid Date Format");
			}
		}
		
		else {
			throw new InvalidFormatException("Invalid Format Exception");
		}
	}
}
 
public class DateException {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Date (Format : DD-MMM-YYYY) : ");
			DobCheck dc = new DobCheck(sc.next());
		}
		catch(InvalidFormatException e) {
			System.out.println("Error: "+e);
		}
 
	}
 
}
 