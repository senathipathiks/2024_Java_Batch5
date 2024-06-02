package com.day2ex;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String str = sc.nextLine();
		
			String [] arr = str.split(" ");
			System.out.print("Reversed Sentence: ");
			for(int i = arr.length-1; i>=0;i--) {
				System.out.print(arr[i]+" ");
			}

	}

}
