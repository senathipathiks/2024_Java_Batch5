package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class insertAnElementIntoTheArrayListAtTheFirstPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		System.out.println("Enter the no of Element :");
		for(int i=0; i<no; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Enter the Element to add in first:");
		int fs = sc.nextInt();
		list.add(0,fs);
		
		System.out.println(list);
	}

}
