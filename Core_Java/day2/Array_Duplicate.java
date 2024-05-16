package com.day2;

import java.util.Scanner;

public class Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int temp[] = new int[arr.length];
		boolean flag = false;
        System.out.println("Duplicates elements are:");
 		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					temp[i] = arr[i];
					System.out.println(temp[i]);
					flag = true;
					
				}
			}
		}
 		if(flag == false) {
 			System.out.println("no duplicates");
 		}

	}

}
