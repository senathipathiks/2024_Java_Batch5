package Exceptionhandling.java;

import java.time.Month;
import java.util.Scanner;



class InvalidMonthException1 extends Exception{
	InvalidMonthException1(String str){
		super(str);
	}
}
public class InvalidMonthException {
 
	static void validate(int n) throws InvalidMonthException1{
		if(n>=1 && n<=12) {
			switch(n) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Febraury");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			}
		}
		else {
			throw new InvalidMonthException1("INVALID MONTH RANGE");
		}
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month 1 - 12 it gives corresponding 1-january to 12-december");
		int n = sc.nextInt();
		try {
			
		   validate(n);
		}
		catch(InvalidMonthException1 e) {
			System.out.println(e);
		}
 
	}
 
}
		
		
		

	

