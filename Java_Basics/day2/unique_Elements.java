package day2;

import java.util.*;

public class unique_Elements {

	static void unique(int b, int arr[]) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				if (i == j) {
					continue;
				} else {
					if (arr[i] == arr[j] && arr[j]!=-1) {
						arr[j] = -1;
						arr[i] = -1;

					}
				}

			}

		}

		for (int i = 0; i < b; i++) {
			if (arr[i] != -1)
				System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int arr[] = new int[b];
		for (int i = 0; i < b; i++) {
			arr[i] = sc.nextInt();
		}
		unique(b, arr);

	}

}
