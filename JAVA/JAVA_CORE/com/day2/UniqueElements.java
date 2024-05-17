package com.day2;

import java.util.Scanner;

public class UniqueElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(int i =0;i<arr.length;i++)
		{
			flag=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
					flag=1;
					break;
				}
			}
			if(flag==0 && arr[i]>0)
			{
				System.out.println(arr[i]);
			}
		}
//		if(flag==0)
//		{
//			System.out.println(arr[i]);
//		}

	}

}
