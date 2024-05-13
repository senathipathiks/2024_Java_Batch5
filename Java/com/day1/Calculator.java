package com.day1;

public class Calculator {
	public static void main(String[] args) {
		int c = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		if(c == 1) {
			System.out.println("Addtion = "+ (a+b));
		}
		else if(c == 2) {
			System.out.println("Addtion = "+ (a-b));
		}
		else if(c == 3) {
			System.out.println("Addtion = "+ (a * b));
		}
		else if(c == 4) {
			if(b == 0) {
				System.out.println("Divisor is 0");
			}
			else {
				System.out.println("Addtion = "+ (a/b));
			}
		}
		else {
			System.out.println("Select from the given choice");
		}
	}
}
