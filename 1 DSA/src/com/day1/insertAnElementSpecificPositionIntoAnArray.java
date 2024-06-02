package com.day1;
import java.util.Scanner;

public class insertAnElementSpecificPositionIntoAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array size:");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index to  add :");
		int inx = sc.nextInt();
		
		System.out.println("Enter the element to  add :");
		int ele = sc.nextInt();
		
		int arr1[]=new int[x+1];
		
		arr1[inx]=ele;
		
		int a=0;
		
		for(int i = 0 ; i < x  ; i++ ) {
			if(inx==a) {	
				a++;
        	}
        	arr1[a]=arr[i];
        	a++;
		}
		
		for(int i = 0 ; i < x+1 ; i++) {
			System.out.println(arr1[i]);	
		}
	}
}
