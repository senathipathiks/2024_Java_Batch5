package com.day1;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the multiplication table:");
		int num = sc.nextInt();
		
		
		int i;
		for(i=1; i<=10;i++) {
			System.out.println(i+" "+"x"+" "+num+" "+"="+(i*num));
		}
	}

}
