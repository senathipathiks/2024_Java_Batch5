package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class etrieveAnElementAtASpecifiedIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		System.out.println("Enter the Elements :");
		for(int i=0; i<no; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the Index of etrive element : ");
		int ret = sc.nextInt();
		
		System.out.println("The Etrieve Element is :" + list.get(ret));
	}

}
