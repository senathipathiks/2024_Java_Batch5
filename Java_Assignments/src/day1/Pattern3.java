package day1;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		int d = rows/2;
		int dummy = 0;
		for(int i=0; i<rows/2;i++) {
			for(int j=0; j<rows;j++) {
				if(j<=d+dummy && j>=d-dummy) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				}
				dummy++;
				System.out.println();
		}
	}

	

}