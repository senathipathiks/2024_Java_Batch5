package com.Presentation;

import java.util.Scanner;

public class BubbleSort {
	
	//bubble sort function definition
	static int[] bubbleSort(int arr[]) {
		int n = arr.length;  //	finding length of the array
        int temp;
        for(int i=0; i < n; i++) {
        	for(int j=1; j < (n-i); j++) {
        		if(arr[j-1] > arr[j]) {
        			//swap elements
        			temp = arr[j-1];
        			arr[j-1] = arr[j];
        			arr[j] = temp;
        		}
        	}
         }
        return arr;
	}

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner sc = new Scanner(System.in);
		
		// Input: Array elements
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
		    a[i] = sc.nextInt();
		}
		
		//apply bubble sort
		a = bubbleSort(a);
		
		//print array
		for(Integer i : a) {
			System.out.print(i+" ");
		}

	}

}
