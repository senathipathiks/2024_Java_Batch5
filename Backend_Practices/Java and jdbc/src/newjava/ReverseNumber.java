package newjava;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class ReverseNumber {
	public static void main(String[] args) {
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
