package com.day6;

import java.io.FileInputStream;

public class FileInputExample {
	public static void main(String args[]) {
//		try {
//			FileInputStream fin = new FileInputStream("D://n.txt");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("Exception Handled Successfully");
		
		try {
			Class class1 = Class.forName("ExceptionDemo3");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Exception Handled Successfully");
	}

}
