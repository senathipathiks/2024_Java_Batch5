package com.day2_String;

public class StringBuilderEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("Vigneswaran,RK");
		System.out.println(str.append(" from Kovilpatti"));
//		System.out.println(str.insert(3,"velan"));
		System.out.println(str.reverse());
		System.out.println(str);
		str.setCharAt(3, 'b');
		System.out.println(str);
	}
	}

