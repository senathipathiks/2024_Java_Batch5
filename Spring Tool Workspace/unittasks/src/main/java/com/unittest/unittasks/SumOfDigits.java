package com.unittest.unittasks;

public class SumOfDigits {

	public static int sod(int num) {
		int temp = 0, m, n = 123;
		if(n>0) {
			while(n>0) {
				m = n%10;
				temp = temp+m;
				n = n/10;
			}
			return 1;
		}
		else {
			return 0;
		}
	}

}
