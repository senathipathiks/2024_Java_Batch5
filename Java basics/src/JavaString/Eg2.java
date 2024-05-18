package JavaString;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("             Relevantz            ");
		System.out.println(str1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('e'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.equals("relevantz"));
		System.out.println(str1.equalsIgnoreCase("relevantz"));
		System.out.println(str1.compareTo("Relevant"));
		System.out.println(str1.compareToIgnoreCase("relevantz"));
		System.out.println(str1.contains("tz"));
		System.out.println(str1.startsWith("Re"));
		System.out.println(str1.endsWith("z"));
		System.out.println(str1.replace('e','a'));
		System.out.println(str1);
		System.out.println(str1.trim());
	}

}
