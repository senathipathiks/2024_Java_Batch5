package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementList {

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
		System.out.println("Enter Element to be searched : ");
		int sea = sc.nextInt();
		if(lst.contains(sea)) {
			for(int i = 0; i < lst.size(); i++) {
				int el = lst.get(i);
				if(el == sea) {
					System.out.println("Element "+ sea + " is found in "+ i);
					break;
				}
			}
		}
		else {
			System.out.println("Element "+ sea + " is Not found");
		}
		sc.close();

	}

}
