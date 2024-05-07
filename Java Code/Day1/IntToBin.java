package com.day1;

import java.util.Scanner;

public class IntToBin {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter the Integer:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
        System.out.print(Integer.toBinaryString(n));
	}
}
