package taskCore;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a positive integer: ");
		        int number = scanner.nextInt(); // Read user input

		        int sum = 0;
		        int originalNumber = number; // Store the original number for later comparison

		        while (number != 0) {
		            int digit = number % 10;
		            sum += digit;
		            number /= 10;
		        }

		        System.out.println("Sum of digits of " + originalNumber + ": " + sum);

		        scanner.close(); // Close the scanner to release resources
		    }
		


	}


