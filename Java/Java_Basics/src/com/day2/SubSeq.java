package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class SubSeq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Range:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int in,i;
		
		System.out.println("Enter the numbers:");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
//		System.out.println("\nThe entered numbers are:");
//		for(i=0;i<n;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		Arrays.sort(arr);
		
//		System.out.println("\nSorted order:");
//		for(i=0;i<n;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		int ans = 0,count=0,x=0,y=0,start=0,end=0;
		for(i=0;i<arr.length;i++) {
			if(i>0 && arr[i] == arr[i-1]+1) {
				count++;
				end = i;
			}
			else {
				start = i;
				count = 1;
			}
			
			if(ans < count) {
				ans = count;
				x = start;
				y = end;
			}
		}
		
		for(i=x;i<=y;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
