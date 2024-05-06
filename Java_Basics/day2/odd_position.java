package day2;

import java.util.*;

public class odd_position {
	static void odd(int n, int arr[]) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		odd(n, arr);

	}

}
