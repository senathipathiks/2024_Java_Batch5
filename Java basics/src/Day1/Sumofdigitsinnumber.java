package Day1;

import java.util.Scanner;

public class Sumofdigitsinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits: ");
		int a = sc.nextInt();
		
		int sum = 0;
		while(a!=0) {
			int b =  a % 10;
			sum = sum + b;
			a = a/10;
			
		}
System.out.println(sum);
	}

}
