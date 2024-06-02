package com.day5;

import java.util.HashSet;
import java.util.Scanner;

public class emptyAnHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in set");
		int num = sc.nextInt();
		
		System.out.println("The elements are");
		for(int i=0; i<num; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println("The elements before clear : "+set);
		
		set.clear();
		System.out.println("The elements after clear : "+set);
	}

}
