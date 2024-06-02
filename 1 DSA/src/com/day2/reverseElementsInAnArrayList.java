package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseElementsInAnArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		for(int i=0; i<no; i++) {
			list.add(sc.nextInt());
		}
		
		for(int i=no-1; i >= 0; i--) {
			list1.add(list.get(i));
		}
		System.out.println("The reverse array: " + list1);
		
	}

}
