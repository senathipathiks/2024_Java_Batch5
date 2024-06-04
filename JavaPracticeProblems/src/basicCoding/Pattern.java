package basicCoding;

import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j <= i) {
				System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
		}
			System.out.println();
	}
		

	}

}
