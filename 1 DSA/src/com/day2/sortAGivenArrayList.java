package com.day2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class sortAGivenArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		System.out.println("Enter The elements :");
		for(int i=0; i<no; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		System.out.println("The sorted elements are :");
		System.out.println(list);
	}

}
