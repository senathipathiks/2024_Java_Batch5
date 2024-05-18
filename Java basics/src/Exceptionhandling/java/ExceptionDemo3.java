package Exceptionhandling.java;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];
		
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0;i<=4;i++)
			{
				arr[i] = sc.nextInt();			
		}
	}
	
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
