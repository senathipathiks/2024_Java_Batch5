package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lst = new ArrayList<>();
		System.out.println("Enter the no.of.Element to append : ");
		int ele = sc.nextInt();
		
		System.out.println("Enter " + ele +"  number: ");
		for(int i = 0; i < ele; i++) {
			lst.add(sc.nextInt());
		}
		System.out.println("Enter the index to be retrieved : ");
		int get = sc.nextInt();
		System.out.println("In Index "+ get + " we have number " + lst.get(get));
		sc.close();

	}

}
