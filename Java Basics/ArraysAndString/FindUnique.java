package ArraysAndString;

import java.util.Scanner;

public class FindUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Unique elements of an array");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					continue;
				}
				if(a[i]==a[j] && a[j] != -1) {
					a[j]= -1;
					a[i]= -1;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(a[i] != -1) {
				System.out.println(a[i]);
			}
		}

	}

}
