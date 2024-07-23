package com.day2;

import java.util.Scanner;

public class CountOE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int ocount=0;
		
		System.out.println("Enter the elements:");
		for(int i = 0; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i = 1; i < n ; i++) {
			if(arr[i]%2!=0) {
				ocount++;
			}
		}
		
		int pcount = 0;
		for(int i = 2; i <= n ; i++) {
			for(int j=2; j<=(i/2) ; j++) {
				if(i%j == 0) {
					pcount++;
					break;
				}
			}
		}

		System.out.println("Odd number Count is:"+ocount+"\nPrime number Count is:"+pcount);
	}

}
