package com.subash.testsample;

import java.util.ArrayList;

public class ArraySubset {

	public static int[] arraySubset(int a[], int subset[]) {
		int empty[] = new int[0];
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}
		int initial = 0;
		int upComing = 0;

		for (int i = 0; i < subset.length; i++) {

			if (arr.contains(subset[i])) {
				int elementIndex = arr.indexOf(subset[i]);
				if (i == 0) {
					initial = elementIndex;
				} else {
					upComing = elementIndex;
					if (initial > upComing) {
						return empty;
					}
					initial = upComing;
				}
			} else {
				return empty;
			}

		}
		return subset;
	}
}
