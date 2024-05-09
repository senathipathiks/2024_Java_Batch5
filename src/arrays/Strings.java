package arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1=new String(" keerthy");
System.out.println(str1);
System.out.println(str1.charAt(3));
System.out.println(str1.indexOf('e'));
System.out.println(str1.length());
System.out.println(str1.lastIndexOf('e'));
System.out.println(str1.toUpperCase());
System.out.println(str1.equals("KeerthY"));
System.out.println(str1.equalsIgnoreCase("KeerthY"));
System.out.println(str1.compareTo("Keethy"));//based on the length
System.out.println(str1.compareToIgnoreCase("Keerthy"));
System.out.println(str1.replace('y', 'i'));
System.out.println(str1.repeat(3));
System.out.println(str1);
System.out.println(str1.trim());//removing white spaces
System.out.println(str1.substring(1, 3));
System.out.println(str1.startsWith(" k"));
System.out.println(str1.endsWith("y"));





//String str2="keerthy";
//System.out.println(str2);

//if(str1==str2) {
//	System.out.println("true");
//}else {
//	System.out.println("false");
//}

	}

}
