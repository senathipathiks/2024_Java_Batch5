package day1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
