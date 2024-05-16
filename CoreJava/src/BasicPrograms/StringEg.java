package BasicPrograms;

public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Velan";
		System.out.println(str1);
		//String str2="Velan"; // string poll both reference are same
		String str2=new String("Velan"); // not same
		System.out.println(str2);
		if(str1==str2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.compareTo("Velan")); // return integer value
	    System.out.println(str1.contains("la"));
	    System.out.println(str1.replace('e', 'a'));
	    
	    StringBuffer sb=new StringBuffer("Velan,Vicky");
	    System.out.println(sb.insert(2, "lusu"));
		
	    
	}
}
