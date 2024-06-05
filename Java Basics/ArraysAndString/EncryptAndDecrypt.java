package ArraysAndString;

import java.util.Scanner;

public class EncryptAndDecrypt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s = sc.next();
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		int ch[] = new int[s.length()];
		
		System.out.println("Encryption :");
		for(int i=0;i<s.length();i++) {
			ch[i] = (int)s.charAt(i) + key;
			System.out.print((char)ch[i]);
		}
		
		System.out.println("\nDecryption :");
		for(int i=0;i<s.length();i++) {
			
			System.out.print((char)(ch[i]-key));
		}
		

	}

}
