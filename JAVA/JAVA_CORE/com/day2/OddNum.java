package com.day2;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
//				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println(count);
	}

}
