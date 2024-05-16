package com.day2;

public class Stringoperation {

	public static void main(String[] args) {
		String str = new String("Relevantz");
		System.out.println(str);
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('e')); // it will return first occurence index
		System.out.println(str.length());
		System.out.println(str.lastIndexOf('e')); // it will return last occurence index of string
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.equals("relevantz"));
		System.out.println(str.equalsIgnoreCase("relevantz"));
		System.out.println(str.compareTo("Relevantz"));
		System.out.println(str.compareTo("Relevant"));
		System.out.println(str.compareTo("Relevantza"));
		System.out.println(str.compareToIgnoreCase("relevantz"));
		System.out.println(str.contains("ntz"));
		System.out.println(str.startsWith("Re"));
		System.out.println(str.endsWith("z"));
		System.out.println(str.replace('e', 'a'));
		System.out.println(str);
		System.out.println(str.repeat(3));
		System.out.println(str.trim()); //remove leading and trailing white space
		System.out.println(str.strip());
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,6));
		System.out.println(str.concat(" aravind"));
		
		String[] str2 = str.split(","); // return type of split is array
		for(String s : str2) {
			System.out.println(s);
		}
	
		
		

	}

}
