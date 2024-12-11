package day1;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Integer: ");
		int num = in.nextInt();
		int rev = 0;
		while(num > 0) {
			rev = (rev * 10) + num % 10;
			num /= 10;
		}
		
		num = rev;
		System.out.println("Reverse Number is "+ num);

	}

}
