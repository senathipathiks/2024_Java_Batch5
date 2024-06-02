package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class addSomeColorsAndPrintOutTheCollection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		System.out.println("Enter the no of Element :");
		for(int i=0; i<no; i++) {
			list.add(sc.next());
		}
		
		System.out.print(list);
	}

}
