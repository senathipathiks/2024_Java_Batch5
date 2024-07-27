package mypackage;

import java.util.Scanner;

public class Factorial
{
	static void fact(int k)
	{
		int f=1;
		for(int i=1;i<=k;i++)
		{
			f = f * i;
		}
		System.out.println(k+" "+"Factorial is : "+f);
	}
	public static void main(String[] args)
	{
		int arr[]=new int[3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int k = arr[i];
			fact(k);
		}
		
	}

}

