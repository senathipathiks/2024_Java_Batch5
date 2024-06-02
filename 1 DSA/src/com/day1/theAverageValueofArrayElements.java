package com.day1;
import java.util.*;
public class theAverageValueofArrayElements{
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The No of elements:");
		int x = sc.nextInt();
		float avg ;
		float sum = 0;
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
			sum = sum + arr[i];
		}
		avg = sum / x ;
		System.out.println("The Average Value is :" + avg);
	}
}
