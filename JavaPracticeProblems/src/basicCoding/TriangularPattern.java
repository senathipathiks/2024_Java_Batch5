package basicCoding;

import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		int d = n/2;
		int num = 0;
		for(int i=0; i<n/2;i++) {
			for(int j=0; j<n;j++) {
				if(j<=d+num && j>=d-num) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				}
				num++;
				System.out.println();
		}
	}

}
