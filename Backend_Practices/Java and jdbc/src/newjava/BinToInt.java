package newjava;

import java.util.Scanner;

public class BinToInt {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a binary string: ");
		String bin = s.nextLine();
		
		int number = binaryToDecimal(bin);
		System.out.println("Integer representation of " + bin + " is: " + number);
		
	}

	

	private static int binaryToDecimal(String bin) {
		
		int decimal = 0;
		int n = bin.length();
		
		for(int i =0; i<n;i++) {
			if(bin.charAt(i) == '1') {
				decimal += Math.pow(2,  n-i-1);
			}
			
		}
		
		return decimal;
	}

	
}
