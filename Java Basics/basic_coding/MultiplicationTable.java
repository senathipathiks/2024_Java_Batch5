package basic_coding;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the multiplication table");
		int number = sc.nextInt();
		System.out.println("---------Multiplication table for"+number+" -----------");

		for(int i = 1;i <= 10; i++) {
			System.out.println(i+"*"+number+" = "+i*number);
		}

	}

}