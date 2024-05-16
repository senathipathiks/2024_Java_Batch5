package Day4;

import java.util.Scanner;

class InvalidMonthException extends Exception
{
	InvalidMonthException(String msg)
	{
		super(msg);
	}
}

class CheckMonth
{
	CheckMonth(int month)throws InvalidMonthException
	{
		if(month<1 || month>12)
		{
			throw new InvalidMonthException("Invalid Month");
		}
		else
			System.out.println("Month :"+month);
	}
	
}

public class InvalidMonth {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		try {
			CheckMonth cm=new CheckMonth(month);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
