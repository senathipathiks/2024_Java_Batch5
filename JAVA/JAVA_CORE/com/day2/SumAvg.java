package com.day2;
import java.util.Scanner;
public class SumAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The sum of the array is "+sum);
		System.out.println("The average of array "+sum/arr.length);

	}

}
