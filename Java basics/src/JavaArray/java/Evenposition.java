package JavaArray.java;

import java.util.Scanner;

public class Evenposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(i%2 ==0) {
				System.out.println(a[i]);
			}
		}

	}

	
}
