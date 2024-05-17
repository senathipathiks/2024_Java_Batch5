package com.day2;
import java.util.Scanner;
public class SortInDesc {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[arr.length-1];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j])
				{
					max=arr[i];
				}
				else
				{
					min=arr[i];
				}
				
			}
		}
		System.out.println(max +" "+ min);
	}

}
