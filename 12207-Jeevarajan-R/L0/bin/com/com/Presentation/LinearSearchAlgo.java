package com.Presentation;

import java.util.Scanner;

public class LinearSearchAlgo {
	
	public static int linearSearch(int[] array, int target) {
	    // Implementation goes here
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i; // Return the index if target is found
			}
		}
		return -1; // Return -1 if target is not found
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Input: Array elements
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
		    array[i] = sc.nextInt();
		}

		// Input: Target element to search
		System.out.print("Enter the target element: ");
		int target = sc.nextInt();
		
		// Perform linear search
		int result = linearSearch(array, target);

		// Output: Display the result
		if (result != -1) {
		    System.out.println("Element " + target + " found at index " + result);
		} else {
		    System.out.println("Element " + target + " not found in the array");
		}
	}
}
