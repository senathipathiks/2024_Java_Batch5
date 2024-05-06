package day2;

import java.util.*;

public class Array_sum_avg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		int add = 0;

		for (int i = 0; i < 10; i++)

		{
			arr[i] = sc.nextInt();
			add = add + arr[i];
		}
		System.out.println("The addition of every numbers are "+add);

		System.out.println("The average is " + add / 10);

	}

}
