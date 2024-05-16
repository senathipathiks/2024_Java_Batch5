package com.day6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int [] a = new int[5];
		try { // set of statement which cause/ throw the exception
			//int arr[] = new int[-2];
			a[5] = 10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception Handled Successfully");

	}

}
