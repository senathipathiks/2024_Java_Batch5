package com.subash.testsample;

public class MaxValueOfDigit {

	public static int maxValueOfDigit(int n) {
		int largestNumber = n%10;
		n/=10;
		while(n!=0) {
			int lastDigit = n%10;
			if(lastDigit > largestNumber) {
				largestNumber = lastDigit;
			}
			n/=10;
		}
		System.out.println(largestNumber);
		return largestNumber;
	}
}
