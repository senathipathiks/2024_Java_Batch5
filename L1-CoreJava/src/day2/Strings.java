package day2;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = new String("Sample");
     String str1 = "Sample";
     String str2 = "Sample";
    		 String str3 = new String("Sample");
    		 
    		 if(str == str3) {
    			 System.out.println("True");
    		 }
    		 else {
    			 System.out.println("false");
    		 }
 if(str1 == str3) {
	 System.out.println("True");
    		 }
    		 else {
    			 System.out.println("False");
    		 }
 if(str1 == str2) {
	 System.out.println("True");
 }
 else {
	 System.out.println("False");
 }
 System.out.println(str.equals(str2));
 System.out.println(str1.charAt(1));
	System.out.println(str1.indexOf('e'));
	System.out.println(str1.length());
	
	System.out.println(str1.lastIndexOf('e'));
	System.out.println(str1.toLowerCase());
	System.out.println(str1.toUpperCase());
	System.out.println(str1.equals("\nSample"));
	System.out.println(str1.equalsIgnoreCase("\nsample"));
	System.out.println(str1.compareTo("Sample"));
	System.out.println(str1.compareToIgnoreCase("Sample"));
	System.out.println(str1.contains("tz"));
	System.out.println(str1.startsWith("\nS"));
	System.out.println(str1.endsWith("z"));
	System.out.println(str1.replace("e","a"));
	System.out.println(str1);
	StringBuffer str4 = new StringBuffer("Relevantz");
	System.out.println(str4.replace(0,5,str1));
	System.out.println(str4);
	System.out.println(str4.append("Technology"));
	System.out.println(str4);
	System.out.println(str.concat(str3));
	System.out.println(str);
	System.out.println(str4.insert(5, "Services "));
	str4.setCharAt(4, 'R');
	System.out.println(str4);
	}

}
