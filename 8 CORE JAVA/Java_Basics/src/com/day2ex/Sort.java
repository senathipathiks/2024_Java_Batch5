package com.day2ex;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int x = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[x];
		for(int i=0;i<x;i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean swapped;
		do {
		      swapped = false;
		      for (int i = 1; i < x; i++) {
		        if (arr[i - 1] > arr[i]) {
		          int temp = arr[i - 1];
		          arr[i - 1] = arr[i];
		          arr[i] = temp;
		          swapped = true;
		        }
		      }
		    } while (swapped);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
