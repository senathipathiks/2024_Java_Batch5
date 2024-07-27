package com.day1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int rem,rev=0;
		
		while(num>0) {
			rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reversed number :"+rev);
	}

}
