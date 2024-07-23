package com.day5;

import java.util.Scanner;

public class NumberFormatExcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "Arjun";
		
		try {
			int a = Integer.parseInt(name);
			
		}
		
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
		finally {
			System.out.println("Exception Handled Successfully!!!");
		}


	}

}
