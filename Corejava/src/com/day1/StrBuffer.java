package com.day1;

public class StrBuffer {
	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("Relevantz,chennai");
		System.out.println(str1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.append("and Virudhunagar"));
		System.out.println(str1);
		System.out.println(str1.insert(3,"sena"));
		System.out.println(str1.reverse());
		System.out.println(str1);
		str1.setCharAt(0, 'R');
		System.out.println(str1);
	}

}
