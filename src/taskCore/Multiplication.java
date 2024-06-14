package taskCore;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt(); // Read user input

		        System.out.println("Multiplication table for " + num + ":");
		        for (int i = 1; i <= 10; ++i) {
		            System.out.printf("%d * %d = %d%n", num, i, num * i);
		        }

		        scanner.close(); // Close the scanner to release resources
		    }
		


	}


