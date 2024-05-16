package com.day6_Exception;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//class Invalid extends Exception {
//	Invalid(String msg) {
//		super(msg);
//	}
//}

class Invalid extends Throwable {
	Invalid(String msg) {
		super(msg);
	}
}

class Election {

	Election(int age) throws Invalid {
		if (age < 18 || age > 110) {
			throw new Invalid("Not Valid");
		} else {
			System.out.println("Welcome the Election Commision");
		}
	}

}

public class Sample {

	public static void main(String[] args) {
//		int a =10;
//		int b = 0;
//		
//		try {
//		int c = a/b;
//		}
//		
//		catch(Exception e) {
//			System.out.println(e);
//		}

//		int arr[] = new int[2];
//		
//		try {
//			System.out.println(arr[3]);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		try {
//			int arr[] = new int[-5];
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}

//		String no = "name";
//		try {
//			int a = Integer.parseInt(no);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		String no = "name";
//		try {
//			char c = no.charAt(5);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}

//		FileInputStream fin = new FileInputStream("C:\\Users\\vigneswaran.rajesh\\Documents\\Main.txt");
//		System.out.println("Exception Handled Successfully");

//		try {
//			Class class1 = Class.forName("Simple");
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println("Class Not Found");
//		}

//		int arr[] = new int[5];
//		Scanner s = new Scanner(System.in);
//		try {
//			for(int i=0;i<=4;i++) {
//				arr[i]=s.nextInt();
//			}
//		}
//		catch(NumberFormatException e) {
//			System.out.println(e);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		catch(InputMismatchException e) {
//			System.out.println(e);
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
//		finally {
//		System.out.println("Exception Handled Succesfully");
//		}
		
//		try {
//			Election E = new Election(12);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		try {
			Election E = new Election(12);
		} catch (Throwable e) {
			System.out.println(e);
		}
		System.out.println("Exception Handled Successfully");

	}
}
