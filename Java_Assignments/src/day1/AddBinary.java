package day1;

import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first binary number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second binary number");
		int n2 = sc.nextInt();
		
		int x1 = 0;
		int result1 = 0;
		int result2 = 0;
		int x2 = 0;
		
		while(n1 != 0) {
			int temp = n1%10;
			result1 += temp * Math.pow(2, x1);
			n1 = n1/10;
			x1++;
		}
		while(n2 != 0) {
			int temp = n2%10;
			result2 += temp * Math.pow(2, x2);
			n2 = n2/10;
			x2++;
		}
		
		System.out.println("ADDITION OF TWO BINARY NUMBER : "+ (result1 + result2));

	}

}