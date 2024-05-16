package com.java.presentation;

import java.util.StringJoiner;


public class Joiner {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringJoiner j = new StringJoiner(",");
//		j.add("vicky");
//		j.add("vidhu");
//		j.add("velan");
//		System.out.println(j);
//		
//		//using perfix and suffix
//		StringJoiner jj = new StringJoiner(",", "(",")");
//		jj.add("name1");
//		jj.add("name2");
//		jj.add("name3");
//		System.out.println(jj);
//		
//		//joining 2 StringJoiner
//		StringJoiner merge = j.merge(jj);
//		System.out.println(merge);
//		
		
			       // Without using StringJoiner
			       String resultWithout = "";
			       for (int i = 1; i <= 5; i++) {
			           resultWithout += "Number: " + i + ", ";
			       }
			       System.out.println("Without StringJoiner: " + resultWithout);
			       // Using StringJoiner
			       StringJoiner joiner = new StringJoiner(",", "(",")");
			       for (int i = 1; i <= 5; i++) {
			           joiner.add("Number: " + i);
			       }
			       String resultWith = joiner.toString();
			       System.out.println("With StringJoiner: " + resultWith);
			   }
			
	}


