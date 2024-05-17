package com.day2;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			flag=0;
			int num=arr[i];
			if(num!=1 && num!=0)
			{
				for(int j=2;j<num-1;j++)
				{
					if(num%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println("Not a prime");
				}
				else
				{
					System.out.println("Prime");
				}
				
			}
			else
			{
				System.out.println("1 or 0 is not a prime number");
			}
			
		}
	}

}
