package newjava;

import java.util.Scanner;

public class NoOfDays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = in.nextInt();
		System.out.print("Enter Month in terms of (1 to 12): ");
		int month = in.nextInt();
		
		boolean leap = false;
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			leap = true;
		}
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("No. of Days = 31");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("No. of Days = 30");
		}
		else if(month == 2 && leap) {
			System.out.println("No. of Days = 29");
		}
		else {
			System.out.println("No. of Days = 28");
		}
	}
}
