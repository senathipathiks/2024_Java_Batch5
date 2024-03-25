package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove3rdElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lst = new ArrayList<>();
		System.out.println("Enter the no.of.Element to append(should be minimum of 3 values) : ");
		int ele = sc.nextInt();
		
		System.out.println("Enter " + ele +"  number: ");
		for(int i = 0; i < ele; i++) {
			lst.add(sc.nextInt());
		}
//		System.out.println("Enter the number to be removed : ");
//		int rem = sc.nextInt();
		lst.remove(2);
		System.out.println(lst);
		sc.close();
	}

}
