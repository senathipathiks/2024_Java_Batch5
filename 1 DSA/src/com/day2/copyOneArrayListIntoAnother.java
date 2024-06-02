package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class copyOneArrayListIntoAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		for(int i=0; i<no; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("1st array : " + list);
		for(int i=0; i<no; i++) {
			list1.add(list.get(i));
		}
		System.out.println("2nd array : " +list1);
	}

}
