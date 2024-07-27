package com.unittest.unittasks;

public class MOD {
	public static int mod(int num) {
		int n=123, temp=0, m;
		if(n>0) {
			while(n>0) {
				m = n % 10;
				if(m > temp) {
					temp = m;
				}
				n = n / 10;
			}
			System.out.println(temp);
			return 1;
		}
		else {
			return 0;
		}
	}
}
