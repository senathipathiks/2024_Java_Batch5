package day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int flag=0;
		String str1 ="";
//		char ch[] = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			str1 = str1+str.charAt(i);
		}
		if(str.equals(str1)) {
				System.out.println("Yes, Pallindrome");
				flag=1;
			}
		if(flag==0) {
			System.out.println("No, Not a Pallindrome");
		}

	}

}
