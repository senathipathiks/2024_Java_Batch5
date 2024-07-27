package com.day5;

import java.util.Scanner;

public class CharExcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "Arjun";
		
		try {
			char ch = name.charAt(5+);
		}
		
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
		finally {
			System.out.println("Exception Handled Successfully!!!");
		}

	}

}
