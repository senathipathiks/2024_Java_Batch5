package com.day2;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Nagarjun,Arjun");
		System.out.println(s1);
		System.out.println(s1.charAt(4));
		System.out.println(s1.append(" NS"));
		System.out.println(s1.delete(0, 5));//index start with 0
		System.out.println(s1.insert(3,"NS"));
		System.out.println(s1.reverse());
		System.out.println(s1.reverse());
		s1.setCharAt(3, 'c');
		System.out.println();
		System.out.println(s1);
	}

}
