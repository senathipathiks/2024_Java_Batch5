package com.day2;

public class Stringeg {

	public static void main(String[] args) {
		
		String str = "Relevantz"; 
//		String str2 = "Relevantz"; //string literals it check string pool if the string is available it will return same references.
		String str2 = new String("Relevantz"); // new memory location is allocated
		System.out.println(str);
		System.out.println(str2);
		if(str == str2) { // == checks the references only not a content
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
