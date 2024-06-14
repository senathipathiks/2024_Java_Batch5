package taskCore;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();

		        for (int i = 1; i <= rows; i++) {
		            // Print spaces before the stars
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }
		            // Print the stars
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*");
		            }
		            System.out.println(); // Move to the next line
		        }
		    }
		}



