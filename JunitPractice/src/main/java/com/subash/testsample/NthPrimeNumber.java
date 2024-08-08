package com.subash.testsample;

public class NthPrimeNumber {

	public static int nthPrimeNumber(int n) {
		 int num = 1, count = 0, i;
	        while (count < n) {
	            num = num + 1;
	            for (i = 2; i <= num; i++) {
	                if (num % i == 0) {
	                    break;
	                }
	            }
	            if (i == num) {
	                count = count + 1;
	            }
	        }
	        
	        return num;
	}
}
