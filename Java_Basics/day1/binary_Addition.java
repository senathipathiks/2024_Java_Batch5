package day1;

import java.util.*;

public class binary_Addition {

	static void add(int a, int b) {

		int arr[] = new int[32];
		int excess = 0;
		int i = 0;
		while (a != 0 || b != 0) {
			int g = a % 10;
			int h = b % 10;
			int m = g + h + excess;
			int l = m % 2;
			arr[i] = l;
			i++;
			excess = m / 2;
			a = a / 10;
			b = b / 10;

		}
		if (excess != 0) {
			arr[i] = excess;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		add(a, b);

	}

}
