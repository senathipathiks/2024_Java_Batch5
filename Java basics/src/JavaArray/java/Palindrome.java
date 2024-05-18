package JavaArray.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s = sc.next();
		int mid = 0;
		if(s.length()%2 != 0) {
			mid = (s.length()/2) - 1;
		} else {
			mid = s.length()/2;
		}
		int end = s.length()-1;
		for(int i=0;i<=mid;i++) {
			if(s.charAt(i) != s.charAt(end)) {
				System.out.println("Not a palindrome");
				return;
				
			}
			end--;
			
		}
		System.out.println("Palindrome");

	}


	}


