package com.day2;

public class String_5 {

	public static void main(String[] args) {
		String str1="Relevantz";
		System.out.println(str1);
		System.out.println(str1.lastIndexOf('e'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.equals("Relevantz"));
		System.out.println(str1.equalsIgnoreCase("Relevantz"));
		System.out.println(str1.compareTo("Relevantz"));// if str1 is greater than str2 then output is 1 ,if opposite then -1 ,if both are same then 0 is output
		System.out.println(str1.compareToIgnoreCase("Relevantz"));
		System.out.println(str1.contains("tz"));
		System.out.println(str1.startsWith("Re"));
		System.out.println(str1.endsWith("e"));
		System.out.println(str1.replace('e','a'));
		System.out.println(str1);
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(4,6));
		
	}
}
