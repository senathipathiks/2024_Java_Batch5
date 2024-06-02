package com.day5;

import java.util.HashSet;
import java.util.Scanner;

public class testIfHashSetIsEmptyOrNot {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in set");
		int num = sc.nextInt();
		
		System.out.println("Enter the  elements : ");
		for(int i=0; i<num; i++) {
			set.add(sc.nextInt());
		}
		
		if(set.isEmpty()) {
			System.out.println("The Set Is Empty");
		}
		else {
			System.out.println("The Set Is Not Empty");
		}
		
	}

}
