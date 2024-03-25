package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertAtFirstPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lst = new ArrayList<>();
		System.out.println("Enter the no.of.Element to append : ");
		int ele = sc.nextInt();
		
		System.out.println("Enter " + ele +" Number : ");
		for(int i = 0; i < ele; i++) {
			lst.add(sc.nextInt());
		}
		System.out.println("Enter number to be inserted : ");
		lst.add(0,sc.nextInt());
		System.out.println(lst);

	}

}
