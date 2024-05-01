package com.day1;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt();
		int r,sum = 0;
		while(num != 0) {
			r = num % 10;
			sum += r;
			num = num/10;	
		}
		System.out.println("sum of digit = "+sum);
	}

}
