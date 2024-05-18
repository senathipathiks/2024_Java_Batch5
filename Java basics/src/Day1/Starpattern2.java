package Day1;

import java.util.Scanner;

public class Starpattern2 {
	
	static void pattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n; j++) {
				if(i <= j) 
					System.out.print("*");
				
				else
					System.out.print("");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		pattern(b);


	}

}
