package com.day2;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[arr.length];
		for(int i =0;i<arr1.length;i++)
		{
			arr1[i]=arr[i];
		}
		for(int i =0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
