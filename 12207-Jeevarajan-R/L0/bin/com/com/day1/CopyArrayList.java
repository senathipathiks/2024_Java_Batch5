package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lst = new ArrayList<>();
		System.out.println("Enter the no.of.Element to append : ");
		int ele = sc.nextInt();
		
		System.out.println("Enter " + ele +" number: ");
		for(int i = 0; i < ele; i++) {
			lst.add(sc.nextInt());
		}
		ArrayList<Integer> newLst = new ArrayList<>(lst);
		System.out.println("New List : " + newLst);

	}

}