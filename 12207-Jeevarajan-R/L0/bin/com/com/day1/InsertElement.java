package com.day1;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the no.of.Element : ");
		int element = sc.nextInt();
		int[] arr = new int[element];
		
		for(int i = 0; i < element; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Element to be inserted : ");
		int insert = sc.nextInt();
		System.out.println("Enter the place/position to be inserted : ");
		int pos = sc.nextInt();
		
		int[] updatedArray = new int[element+1];
		int j = 0;
		for(int i = 0; i < updatedArray.length; i++ ) {
			if(i != (pos-1)) {
				updatedArray[i] = arr[j];
				j++;
			}
		}
		updatedArray[pos-1] = insert;
		System.out.println("Printing updated Array : ");
		for(int i = 0; i < updatedArray.length; i++) {
			System.out.println(updatedArray[i]);
		}
		sc.close();
	}

}
