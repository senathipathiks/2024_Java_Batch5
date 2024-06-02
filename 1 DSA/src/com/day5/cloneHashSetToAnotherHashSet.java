package com.day5;

import java.util.HashSet;
import java.util.Scanner;

public class cloneHashSetToAnotherHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in set");
		int num = sc.nextInt();
		
		System.out.println("Enter The elements :");
		for(int i=0; i<num; i++) {
			set.add(sc.nextInt());
		}
		
		Object[] arr = set.toArray();
		
		for (int i=0; i<num ; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
