package com.day2;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements:");
		for(int i = 0; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Unique elements are");
		for(int i = 0; i < n ; i++) {
			int flag=0;
			for(int j = 0 ; j < n ; j++) {
				if(arr[i] == arr[j]) {
					flag++;
				}
			}
			if(flag==1) {
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}
