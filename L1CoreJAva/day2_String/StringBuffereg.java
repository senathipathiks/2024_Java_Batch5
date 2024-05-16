package com.day2_String;
import java.util.*;
public class StringBuffereg {
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer("Vigneswaran,RK");
		System.out.println(str.append(" from Kovilpatti"));
//		System.out.println(str.insert(3,"velan"));
		System.out.println(str.reverse());
		System.out.println(str);
		str.setCharAt(3, 'b');
		System.out.println(str);
	}
}