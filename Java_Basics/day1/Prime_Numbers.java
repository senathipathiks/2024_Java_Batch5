package day1;

import java.util.*;

public class Prime_Numbers {

	static void prime(int a, int b) {

		for (int i = a; i <= b; i++) {
			int flag = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag++;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		prime(a, b);
	}

}
