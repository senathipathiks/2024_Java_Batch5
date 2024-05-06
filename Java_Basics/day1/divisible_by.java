package day1;

import java.util.*;

public class divisible_by {

	
	static void divisible(int m, int n) {
		for(int i=m;i<=n;i++) {
			if(i==1) {
				continue;
			}
			else if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b= 100;
		divisible(a,b);

	}

}
