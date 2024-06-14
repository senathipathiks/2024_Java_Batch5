package taskCore;
import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();

		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* "); // Print an asterisk followed by a space
		            }
		            System.out.println(); // Move to the next line
		        }
		    }
		

	}


