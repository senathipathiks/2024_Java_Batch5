package com.day6;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num1 =20, num2 =0;
		try { // set of statement which cause/ throw the exception
			int res = num1/num2;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exception Handled Successfully");

	}

}
