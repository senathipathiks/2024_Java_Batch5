package Day2;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		System.out.println(s1);
		if(s.equals(s1)) {
			System.out.println("Given String is Palindrome");
		}
		
	}

}
