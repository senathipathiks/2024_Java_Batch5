package basic_coding;
import java.util.Scanner;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find the sum of digits in a number");
		
		int n = sc.nextInt();
		
		int sum = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum + d;
			n = n/10;
		}

		System.out.println("SUM OF DIGITS IN A NUMBER : "+sum);
		
	}

}
