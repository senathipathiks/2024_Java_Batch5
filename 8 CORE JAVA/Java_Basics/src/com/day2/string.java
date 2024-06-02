package com.day2;

public class string {
	public static void main(String[] args) {
		String str1 =new String("Gopi");
		System.out.println(str1);
		String str2 = "Gopi";
		String str3 = "Gopi";
		System.out.println();
		if(str1==str2) {
			System.out.println("true");
		}
		else {
			System.out.println("flase");
		}
		
		System.out.println();
				
		if(str2==str3) {
			System.out.println("true");
		}
		else {
			System.out.println("flase");
		}
		System.out.println();
		
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf('p'));
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('i'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.equals("gopi"));
		System.out.println(str1.equalsIgnoreCase("gopi"));
		System.out.println(str1.compareTo("Gopik"));
		System.out.println(str1.compareToIgnoreCase("GOPI"));
		System.out.println(str1.compareToIgnoreCase("GOP"));
		System.out.println(str1.contains("G"));
		System.out.println(str1.startsWith("Go"));
		System.out.println(str1.endsWith("pI"));
		System.out.println(str1.replace('G','g'));
		System.out.println(str1);
		System.out.println(str1.repeat(4));
		System.out.println(str1.trim());
		System.out.println(str1.substring(0,2));
		String str5 = "gopi,siva";
		String[] str6 = str5.split(",");
		for(String i:str6) {
			System.out.print(i+" ");
		}
		
		






	}
}
