package com.subash.testsample;

public class NthFibonacciSeries {

	public static int nthFibonacciSeries(int n) {
		
	        if (n == 0) return 0;
	        else if (n == 1 || n == 2) return 1;
	        return nthFibonacciSeries(n - 1) + nthFibonacciSeries(n - 2);
	}
}
