package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class searchForAnElementInAnArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		for(int i=0; i<no; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter The element to find :");
		int find = sc.nextInt();
		
		if(list.contains(find)) {
			System.out.println("The Element is Present in list.");
		}
		else {
			System.out.println("The element is not Present in list.");
		}

	}

}
