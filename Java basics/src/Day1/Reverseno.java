package Day1;

import java.util.Scanner;

public class Reverseno{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		String a = sc.next();
		String result=" ";
		for(int i = a.length()-1; i>=0; i--) {
			result = result + a.charAt(i);
	}
		System.out.println("The reversed number is: " +result);

	}
	}
