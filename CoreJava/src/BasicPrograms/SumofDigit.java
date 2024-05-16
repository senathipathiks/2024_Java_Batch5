package BasicPrograms;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = in.nextInt();
		int sum = 0;
		
		while(num > 0) {
			sum = sum + num% 10;
			num /= 10;
		}
		
		System.out.println("Sum of the digits is "+ sum);

	}

}
