package com.day5;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Scanner;

public class convertHashSetToTreeSet {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in set");
		int num = sc.nextInt();
		
		System.out.println("Enter The elements :");
		for(int i=0; i<num; i++) {
			set.add(sc.nextInt());
		}
		
		TreeSet<Integer> tree = new TreeSet<>();
		
		for(int i : set) {
			tree.add(i);
		}
		
		System.out.println("The Tree Elements : " );
		System.out.println(tree);

	}

}
