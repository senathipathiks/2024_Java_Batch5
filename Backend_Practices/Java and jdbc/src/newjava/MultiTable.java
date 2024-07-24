package newjava;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Which multiplication table you want?");
		int num1= s.nextInt();
		
		for(int i =1; i<11;i++) {
			int res = i*num1;
			System.out.println(i+"*"+num1+"="+res);
		}
		
	}

}
