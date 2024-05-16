package BasicPrograms;

import java.util.Scanner;

public class PrintDay {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number (1 to 7): ");
		int num = in.nextInt();
		
		if(num == 1) {
			System.out.println("Sunday");
		}
		else if(num == 2) {
			System.out.println("Monday");
		}
		else if(num == 3) {
			System.out.println("Tuesday");
		}
		else if(num == 4) {
			System.out.println("Wednesday");
		}
		else if(num == 5) {
			System.out.println("Thursday");
		}
		else if(num == 6) {
			System.out.println("Friday");
		}
		else if(num == 7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
