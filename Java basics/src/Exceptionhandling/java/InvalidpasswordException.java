package Exceptionhandling.java;


import java.util.Scanner;

class InvalidpasswordException1 extends Exception{
	InvalidpasswordException1(String str){
		super(str);
	}
}
public class InvalidpasswordException {
 
	static void validate(int n) throws InvalidpasswordException1{
		if(n>=1 && n<=12) {
			switch(n) {
			case 1:
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				break;
			case 3:
				System.out.println(""");
				break;
			case 4:
				System.out.println("");
				break;
			case 5:
				System.out.println("");
				break;
			case 6:
				System.out.println("");
				break;
			case 7:
				System.out.println("");
				break;
			case 8:
				System.out.println("");
				break;
			case 9:
				System.out.println("");
				break;
			case 10:
				System.out.println("");
				break;
			case 11:
				System.out.println("");
				break;
			case 12:
				System.out.println("");
				break;
			}
		}
		else {
			throw new InvalidpasswordException("INVALID MONTH RANGE");
		}
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month 1 - 12 it gives corresponding 1-january to 12-december");
		int n = sc.nextInt();
		try {
			
		   validate(n);
		}
		catch(InvalidpasswordException e) {
			System.out.println(e);
		}
 
	}
 
}

}
