package ArraysAndString;

import java.util.Scanner;

public class OddNumbersInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			if(a[i]%2 != 0) {
				count++;
				
			}
		}
		System.out.println("NUmber of odd numbers in array : "+count);
	}

}
