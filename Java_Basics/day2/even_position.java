package day2;

import java.util.Scanner;

public class even_position {
	static void even(int n, int arr[]) {
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
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
		even(n, arr);

	}

}