//package com.day1;

public class Calculator {

	public static void main(String[] args) {
		String m = args[0];
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		
			switch(m) {
			case "Add":
				System.out.println("Add="+(a+b));
				break;
			case "Sub":
				System.out.println("Sub="+(a-b));
				break;
			case "Mul":
				System.out.println("Mul="+(a*b));
				break;
			case "Div":
				System.out.println("Div="+(a/b));
				break;
				
			}
			
			
	}
		

	}

