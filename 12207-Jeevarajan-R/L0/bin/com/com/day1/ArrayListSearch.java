package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lst = new ArrayList<>();
		System.out.println("Enter the no.of.Element to append : ");
		int ele = sc.nextInt();
		
		for(int i = 0; i < ele; i++) {
			lst.add(sc.nextInt());
		}
		System.out.println("Enter the element to be searched : ");
		int search = sc.nextInt();
		int j = 0;
		if(lst.contains(search)) {
			for(Integer i : lst) {
				if(search == i) {
					System.out.print( search + " is present in "+ j + " index.");
					break;
				}
				j++;
			}
		} else {
			System.out.println(search + " is Not Present in the ArrayList.");
		}
		
		sc.close();
	}

}
