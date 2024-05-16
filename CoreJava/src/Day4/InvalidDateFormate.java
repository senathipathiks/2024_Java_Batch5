package Day4;

import java.util.Scanner;

class InvalidFormatException extends Exception
{
	InvalidFormatException(String msg)
	{
		super(msg);
	}
}

class CheckDate
{
	CheckDate(String date)throws InvalidFormatException
	{
		String dateformat="^(([0-9])|([0-2][0-9])|([3][0-1]))\\-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\-\\d{4}$"
				+ "";
		if(date.matches(dateformat))
		{
			System.out.println("Date :"+date);
		}
		else {
			throw new InvalidFormatException("Invalid Date Format");
		}
			
	}
	
}


public class InvalidDateFormate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		try {
			CheckDate cm=new CheckDate(date);
		}
		catch(Exception e) {
			System.out.println(e);
		}  
	}

}
