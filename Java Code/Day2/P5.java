package com.day2;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of inputs:");
		int n = sc.nextInt();
		
		System.out.println("Enter the values");
		int arr [] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = 0, count = 0, start = 0, end = 0, x = 0, y = 0;

 
	    for (int i = 0; i < arr.length; i++) {
	        if (i > 0 && arr[i] == arr[i - 1] + 1) {
	            count++;
	            end = i;
	        }
	        else {
	            start = i;
	            count = 1;
	        }
	        if (ans < count) {
	            ans = count;
	            x = start;
	            y = end;
	        }
	    }
	    for (int i = x; i <= y; i++)
	    {
	      System.out.print(arr[i] + " ");
	    }

	}

}
