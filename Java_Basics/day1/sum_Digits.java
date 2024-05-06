package day1;

import java.util.*;

public class sum_Digits {

	static int sumofdigits(int n) {
		int sum = 0;
		while(n!=0) {
			int y = n%10;
			sum = sum + y;
			n=n/10;
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = sumofdigits(a);
		System.out.println(result);

	}

}
