package com.day3;

import java.util.Scanner;
import java.util.LinkedList;

public class practice {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<>();
		
		System.out.println("Enter the no of Strings in a linkedlist: ");
		int x = sc.nextInt();
		
		System.out.println("Enter The " +x+" Strings :");
		for(int i=0; i<x; i++) {
			list.add(sc.next());
		}
		
		System.out.println("Enter the String to find : ");
		String s = sc.next();
		
		int inx=0, flag=0;
		for(int i=0; i<x; i++) {
			if(list.get(i).equalsIgnoreCase(s)) {
				flag=1;
				inx=i;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("The String is present. \nThe String's Index is :" + inx);
		}
		else {
			System.out.println("The string is not present.");
		}
	}

}
