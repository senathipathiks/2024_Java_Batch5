package com.day1;
import java.util.Scanner;

public class copyAnArrayByIteratingTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The No of elements:");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
		}
		
		int arr1[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr1[i]=arr[i];
		}
		
		for(int i = 0 ; i < x ; i++) {
			System.out.print(arr1[i]+" ");	
		}

	}

}
