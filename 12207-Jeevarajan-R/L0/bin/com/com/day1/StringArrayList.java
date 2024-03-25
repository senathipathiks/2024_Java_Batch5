package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> lst = new ArrayList<>();
		System.out.println("Enter the no.of.Element to append : ");
		int ele = sc.nextInt();
		
		System.out.println("Enter the Colors: ");
		for(int i = 0; i < ele; i++) {
			lst.add(sc.next());
		}
		System.out.println(lst);
		sc.close();

	}

}
