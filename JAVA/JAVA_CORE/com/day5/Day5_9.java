package com.day5;
import java.util.Scanner;
public class Day5_9 {

	public static void main(String[] args)throws ClassNotFoundException {
		int[] arr=new int[5];
		Scanner sc = new Scanner(System.in);
		try
		{
			for(int i=0;i<=4;i++)
			{
				arr[i]=sc.nextInt();
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
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception handled successfully");
		}
		

	}

}
