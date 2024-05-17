package com.day2;

public class String_3 {

	public static void main(String[] args) {
		String str1=new String("Relevantz");
		System.out.println(str1);
		String str2=new String("Relevantz");
		System.out.println(str2);
		if(str1==str2)//checks the references
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
