package com.day2;

public class String_6 {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("Relevantz,chennai");
		System.out.println(str1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.append("and virudhunagar"));
		System.out.println(str1);
		System.out.println(str1.insert(3, "ani"));
		System.out.println(str1.reverse());
		System.out.println(str1);
		str1.setCharAt(0,'R');
		System.out.println(str1);
		
}
}
