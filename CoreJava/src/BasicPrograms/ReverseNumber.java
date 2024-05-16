package BasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = in.nextInt();
		int rev = 0;
		while(num > 0) {
			rev = (rev * 10) + num % 10;
			num /= 10;
		}
		
		num = rev;
		System.out.println("Reverse of Number :"+ num);

	}

}
