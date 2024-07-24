package com.aravind.task;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static int sumDigit(int n) {
		int sum = 0;
		while (n != 0) {
			int r = n % 10;
			sum += r;
			n /= 10;
		}
		return sum;
	}

	public static int maxDigit(int n) {
		int large = 0;
		while (n != 0) {
			int r = n % 10;
			large = Math.max(large, r);
			n /= 10;
		}
		return large;
	}

	public static boolean increaseOrder(int n) {
		int arr[] = new int[3];
		int i = 0;

		while (n != 0) {
			int r = n % 10;
			arr[i] = r;
			i++;
			n /= 10;
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		int count = 0;
		for (i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

		if (count == arr.length) {
			return true;
		}
		return false;
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 2; i <= n; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}

	public static int[] subSetArray(int[] arr, int[] arr2) {
		Set<Integer> setArr = new HashSet<>();
		Set<Integer> setArr2 = new HashSet<>();

		for (int num : arr) {
			setArr.add(num);
		}

		for (int num : arr2) {
			setArr2.add(num);
		}

		if (setArr.containsAll(setArr2)) {
			return arr2;
		}
		return new int[] { 0 };
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
