package day1;

import java.util.*;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (a != 0) {
			int y = a % 10;
			System.out.print(y);
			a = a / 10;

		}

	}

}
