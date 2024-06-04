package basicCoding;

import java.util.Scanner;

public class IntegertoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert integer to binary : ");
		int n = sc.nextInt();
		String res = "";
		
		while(n != 0) {
			res = res + n%2;
			n = n / 2;
		}
		System.out.println("Enter the binary number");
		for(int i = res.length()-1;i >= 0; i--) {
			System.out.print(res.charAt(i));
		}
	}
}
