package com.nandha.junit;

public class App {

	public static boolean CompareString(String str1, String str2) {

		if (str1.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}

	public static int Sum(int[] arr) {

		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}

}
