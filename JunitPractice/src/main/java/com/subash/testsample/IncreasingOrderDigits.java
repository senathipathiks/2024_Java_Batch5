package com.subash.testsample;

public class IncreasingOrderDigits {

	public static boolean increaseOrderCheck(int n) {
		int lastDigit = n%10;
		n/=10;
		while(n!=0) {
			if(lastDigit<n%10 || lastDigit==n%10) {
				return false;
			}
			n/=10;
		}
		return true;
	}
}
