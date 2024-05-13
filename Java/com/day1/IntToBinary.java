package com.day1;

import java.util.Scanner;

public class IntToBinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Integer: ");
		int num = in.nextInt();
		String ans = "";
		
		while(num > 0) {
			ans = ans + (num % 2);
			num /= 2;
		}
		
		StringBuilder input1 = new StringBuilder(ans);
        input1.reverse();
        ans = input1.toString();
        
		System.out.println("Binary value: " + ans);
	}
}
