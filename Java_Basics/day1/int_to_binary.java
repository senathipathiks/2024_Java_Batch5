package day1;

import java.util.*;
import java.util.Scanner;

public class int_to_binary {

	static void binary(int a) {
		int i = 0;
		int arr[] = new int[32];
		while (a != 0) {
			arr[i] = a % 2;
			a = a / 2;
			i++;

		}

		for (int j = i - 1; j > -1; j--) {
			System.out.print(arr[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		binary(a);
	}

}
