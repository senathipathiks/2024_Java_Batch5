package Day1;

import java.util.Scanner;

public class Findday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the number 0 to 366");
		
		int n = sc.nextInt();
		int res = n%7;
		
		if(res == 1) {
			System.out.println("MONDAY");
		} else if(res == 2) {
			System.out.println("TUESDAY");
		} else if(res == 3) {
			System.out.println("WEDNESDAY");
		} else if(res == 4) {
			System.out.println("THURSDAY");
		} else if(res == 5) {
			System.out.println("FRIDAY");
		} else if(res == 6) {
			System.out.println("SATURDAY");
		} else {
			System.out.println("SUNDAY");
		}
	}

	

}
