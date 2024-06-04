package com.day1;

public class Str1 {
	public static void main(String[] args) {
		String str1 = new String("Relevantz,chennai");
		System.out.println(str1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('e'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.equals("relevantz"));
		System.out.println(str1.equalsIgnoreCase("relevantz"));
		System.out.println(str1.compareTo("Relevantza"));
		System.out.println(str1.compareToIgnoreCase("relevantz"));
		System.out.println(str1.contains("tz"));
		System.out.println(str1.startsWith("Re"));
		System.out.println(str1.endsWith("z"));
		System.out.println(str1.replace('e', 'a'));
		System.out.println(str1);
		System.out.println(str1.repeat(5));
		System.out.println(str1.trim());
		System.out.println(str1.strip());
		System.out.println(str1.substring(4,6));
		
		String[] str2 = str1.split(",");
		for(String s : str2)
			System.out.println(s);
		
		
	}

}
