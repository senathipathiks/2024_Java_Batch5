package com.day6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
//		String no = "name";
//		try { // set of statement which cause/ throw the exception
//			int a = Integer.parseInt(no);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Exception Handled Successfully");
		
		String no = "name";
		try { // set of statement which cause/ throw the exception
			char c = no.charAt(4);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception Handled Successfully");

	}

}
