package arrays;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer str1=new StringBuffer("Keerthana,Madurai ");
System.out.println(str1);
System.out.println(str1.charAt(1));
System.out.println(str1.append(" and Viruthunagar"));
System.out.println(str1);
System.out.println(str1.insert(3, "Keerthy"));
System.out.println(str1.reverse());
System.out.println(str1);
str1.setCharAt(0, 'K');
System.out.println(str1);


	}

}
