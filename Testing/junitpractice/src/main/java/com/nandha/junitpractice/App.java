package com.nandha.junitpractice;

public class App {
	
	public static int sumOfDigits(int num) {

		int sum = 0;
		int number = num;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}

		System.out.println("Sum of digits in " + num + " is: " + sum);

		return sum;

	}

	public static int maxOfDigits(int num) {

		int number = num;
		int max = Integer.MIN_VALUE;
		while (number != 0) {
			int digit = number % 10;
			if (digit > max) {
				max = digit;
			}
			number /= 10;
		}

		System.out.println("Max of digits in " + num + " is: " + max);

		return max;

	}

	public static boolean increasingOrder(int num) {
		String numStr = Integer.toString(num);

		for (int i = 1; i < numStr.length(); i++) {
			
			int currentDigit = numStr.charAt(i) - '0';
			int previousDigit = numStr.charAt(i - 1) - '0';

			if (currentDigit != previousDigit + 1) {
				System.out.println("False");
				return false;
			}
		}

		System.out.println("True");
		return true;
	}

	    
	    public static long findNthFibonacci(int num) {
	    	int n = num;
	        if (n <= 1) {
	            return n;
	        }
	        
	        long fib1 = 0; 
	        long fib2 = 1; 
	        long fib = 0; 
	        
	        for (int i = 2; i <= n; i++) {
	            fib = fib1 + fib2; 
	            fib1 = fib2; 
	            fib2 = fib; 
	        }
	        
	        System.out.println("The " + num + "th Fibonacci number is: " + fib);
	        return fib;
	    }
	    
	  
	        
	        public static int findNthPrime(int n) {
	            if (n <= 0) {
	                throw new IllegalArgumentException("Invalid input: n should be greater than zero.");
	            }
	            
	            int count = 0; 
	            int number = 2; 
	            
	            while (count < n) {
	                if (isPrime(number)) {
	                    count++;
	                }
	                number++;
	            }
	            
	            return number - 1;
	        }
	        
	        public static boolean isPrime(int num) {
	            if (num <= 1) {
	                return false;
	            }
	            
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    return false;
	                }
	            }
	            
	            return true;
	        }

}
