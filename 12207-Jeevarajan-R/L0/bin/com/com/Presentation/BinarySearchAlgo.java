package com.Presentation;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgo {
	
	public static int BinarySearch(int[] array, int target) {
		int start = 0, end = array.length-1;
		while(start <= end) {
			int mid = start + Math.abs(start-end)/2;
			if(array[mid]==target) {
				return mid;
			}else if(array[mid]<=target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
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
		
		//sort the array
		Arrays.sort(array);
		
		// Perform linear search
		int result = BinarySearch(array, target);

		// Output: Display the result
		if (result != -1) {
		    System.out.println("Element " + target + " found at index " + result);
		} else {
		    System.out.println("Element " + target + " not found in the array");
		}for(Integer a : array) {
			System.out.print(a+" ");			
		}

	}

}
