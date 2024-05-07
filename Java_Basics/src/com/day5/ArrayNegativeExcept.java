package com.day5;

import java.util.Scanner;

public class ArrayNegativeExcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int arr[] = new int[-5];
			arr[5] = 20;
		}
		
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
		finally {
			System.out.println("Exception Handled Successfully!!!");
		}

	}

}
