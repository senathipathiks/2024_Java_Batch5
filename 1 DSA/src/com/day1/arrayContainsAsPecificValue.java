package com.day1;
import java.util.*;
public class arrayContainsAsPecificValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The No of elements:");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
		}
		
		int find;
		System.out.println("Enter the value to find :" );
		find = sc.nextInt();
		
		int count=0;
		for (int i = 0 ; i < x ; i++) {
			if(find == arr[i]) {
				count=1;
				break;
			}
		}
		
		if(count == 1 )
			System.out.println("The Element is present");
		else
			System.out.println("The Element is not present");
	}
}
