package taskCore;
import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a positive integer: ");
		        int number = scanner.nextInt(); // Read user input

		        int reverse = 0;
		        int originalNumber = number; // Store the original number for later comparison

		        while (number != 0) {
		            int remainder = number % 10;
		            reverse = reverse * 10 + remainder;
		            number = number / 10;
		        }

		        System.out.println("The reverse of " + originalNumber + " is: " + reverse);

		        scanner.close(); // Close the scanner to release resources
		    }
		
	}


