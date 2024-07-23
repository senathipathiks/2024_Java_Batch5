package com.day1;

public class Divi {

	public static void main(String[] args) {
		int n=100;
		for(int i=0;i<=n;i++) {
			if((i%3==0) || (i%5==0)) {
				System.out.println(i);
			}
		}
	}
}
