package com.day2;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String in = sc.nextLine();
		
		String a[] = in.split("\\s");
		System.out.println("Reversed Sentence is:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
