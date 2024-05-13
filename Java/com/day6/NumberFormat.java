package com.day6;

import java.util.Scanner;

public class NumberFormat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		try {
			int n = Integer.parseInt(str);
		}
		catch (Exception e) {
			System.out.println("Error "+ e);
		}
		finally {
			System.out.println("Error Handled Successfully");
		}
	}
}
