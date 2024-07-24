package day2;

import java.util.Iterator;

public class Strings {

	public static void main(String[] args) {

		
		String str1 = "\nRelevantz";
		System.out.println(str1);
		String str2 = new String("\nRelevantz");
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("\ntrue");
		}
		else {
			System.out.println("\nfalse");
		}
		
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.length());
		
		System.out.println(str1.lastIndexOf('e'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.equals("\nRelevantz"));
		System.out.println(str1.equalsIgnoreCase("\nRelevantz"));
		System.out.println(str1.compareTo("\nRelevantz"));
		System.out.println(str1.compareToIgnoreCase("\nRelevantz"));
		System.out.println(str1.contains("tz"));
		System.out.println(str1.startsWith("\n"));
		System.out.println(str1.endsWith("z"));
		System.out.println(str1.replace("e","a"));
		System.out.println(str1);
		System.out.println(str1.substring(3,5));
		
		
		String[] strr = str1.split("v");
		for (String i:strr) {
			System.out.println(i);
		}

		
		
		StringBuffer string = new StringBuffer("\nRelevantz");
		
		
		System.out.println(string.replace(2, 3, "q"));
		System.out.println(string);

		System.out.println(string.append("and Vashanth cases"));
		System.out.println(string);

		System.out.println(string.insert(3, "vasi"));
		
		System.out.println(string.reverse());
		System.out.println(string);
		
		string.setCharAt(4, 'N');
		System.out.println(string);
		
		StringBuilder stringb = new StringBuilder("Meow");
		
		System.out.println(stringb.replace(2, 3, "q"));
		System.out.println(stringb);

		System.out.println(stringb.append("and Vashanth cases"));
		System.out.println(stringb);

		System.out.println(stringb.insert(3, "vasi"));
		
		System.out.println(stringb.reverse());
		System.out.println(stringb);
		
		stringb.setCharAt(4, 'N');
		System.out.println(stringb);
		
		

	}

}
