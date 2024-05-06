package day1;

import java.util.Scanner;

public class Multiplication_table {

	static void table(int a) {
		System.out.println("The table for " + a + " is");

		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		table(a);

	}

}
