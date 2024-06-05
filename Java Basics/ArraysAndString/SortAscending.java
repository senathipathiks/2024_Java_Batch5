package ArraysAndString;

import java.util.Scanner;
public class SortAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Array in descending order");
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
