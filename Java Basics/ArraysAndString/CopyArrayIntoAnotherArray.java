package ArraysAndString;

import java.util.Scanner;

public class CopyArrayIntoAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
		}
		
		int copylength = a.length;
		int a1[] = new int[copylength];
		for(int i=0;i<copylength;i++) {
			a1[i] = a[i];
		}
		for(int i:a1) {
			System.out.println(i);
		}

	}

}
