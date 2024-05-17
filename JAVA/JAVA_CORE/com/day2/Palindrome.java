package com.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag=0;
		int i=0,j=arr.length-1;
		while(i<arr.length)
		{
			flag=0;
			if(arr[i]==arr[j])
			{
				flag=1;
			}
			i++;
			j--;
		}
		if(flag==0)
		{
			System.out.println("Not a palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}

	}

}
