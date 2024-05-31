package com.day2;

public class String_ex {

	public static void main(java.lang.String[] args) {
		String str1 = "Immutable";
		System.out.println(str1);
		
		String str2 = "Immutable";
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		//Using object creation
		String strO1 = new String("Immutable");
		System.out.println(str1);
		
		String strO2 = new String("Immutable");
		System.out.println(str2);
		
		if(strO1 == strO2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
