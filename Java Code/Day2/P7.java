package com.day2;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N value :");
		int n = sc.nextInt();
		int a[]= new int[n]; int c=0;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{  
			c=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					c=1;
					break;
				}
			}
			if(c==0)
			{
				System.out.print(a[i]+" ");
			}
		}


	}

}
