package day2;
import java.util.*;
import java.util.Arrays;

public class Java_keywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1= new String("Relevantz");
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
		System.out.println(str1.contains("relevantz"));
		System.out.println(str1.startsWith("Re"));
		System.out.println(str1.endsWith("z"));
		System.out.println(str1.replace('e','a'));
		System.out.println(str1);
		System.out.println(str1.substring(3));
		

		String str2= new String("               Relevantz                   ");

		System.out.println(str2.trim());
		System.out.println(str2.strip());


		

	}

}
