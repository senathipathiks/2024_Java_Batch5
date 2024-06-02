package com.day1;
import java.util.Scanner;

public class removeASpecificElementFromAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array size:");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the to remove :");
		int rem = sc.nextInt();
		
		for(int i = 0 ; i < x ; i++) {
			if(rem == arr[i]) {
				for(int j = i ; j < x-1; j++) {
					arr[j]=arr[j+1];
				}
			}
		}
		for(int i = 0 ; i < x-1 ; i++) {
			System.out.println(arr[i]);	
		}
	}
}
