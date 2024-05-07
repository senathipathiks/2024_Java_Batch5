package com.day2;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    String message = new String();
	    int key = 0;
	    
	    System.out.print("Enter the String for Encryption:");
	    message = sc.next();

	    System.out.print("\nEnter Shift Key:");
	    key = sc.nextInt();
	    
	    String alpha = "abcdefghijklmnopqrstuvwxyz";

	    message = message.toLowerCase();
	    String cipherText = "";
	    
	    for (int i=0;i<message.length();i++)
	    {
	      int charPosition = alpha.indexOf(message.charAt(i));
	      int keyVal = (key + charPosition) % 26;
	      char replaceVal = alpha.charAt(keyVal);
	      cipherText += replaceVal;
	    }
	    System.out.println("\nEncrpyted msg:" + cipherText);   	    
	}
}
