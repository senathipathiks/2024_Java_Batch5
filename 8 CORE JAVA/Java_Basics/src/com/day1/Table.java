package com.day1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to want multiplication table: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i + " X " + num + " = " + num*i);
		}
	}
}
