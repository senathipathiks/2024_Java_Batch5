package com.day2;

public class Stringbuffer {
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer("Relevantz,Chennai");
		System.out.println(str);
		System.out.println(str.charAt(1));
		System.out.println(str.append("and Virudhunagar"));
		System.out.println(str);
		System.out.println(str.insert(3, "aravind"));
		System.out.println(str.reverse());
		System.out.println(str);
		str.setCharAt(0,'R');
		System.out.println(str);
		
	}

}
