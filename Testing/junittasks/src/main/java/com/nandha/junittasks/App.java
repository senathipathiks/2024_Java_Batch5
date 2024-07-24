package com.nandha.junittasks;


public class App 
{
	public static int sumOfDigits(int num) {

		int sum = 0;
		int number = num;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}

		System.out.println("Sum of digits in " + number + " is: " + sum);

		return sum;

	}
}
