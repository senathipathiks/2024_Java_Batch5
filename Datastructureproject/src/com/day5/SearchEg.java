package com.day5;
import java.util.*;
public class SearchEg {
	
	private static int LinearSearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == target) {
				return 0;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the elements: ");
		for (int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.print("Enter the target elements: ");
		int target = sc.nextInt();
		int result = LinearSearch(arr,target);
		
		if(result != -1 ) {
			System.out.println("Element " + target + " found at index " + result);
		} else 
			System.out.println("Element " + target + " not found at array " );
	}

	

	
}


