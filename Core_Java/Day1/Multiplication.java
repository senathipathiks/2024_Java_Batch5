package com.day1;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Which table you want to dispaly:");
		int m = s.nextInt();
		for(int i = 1; i <=10; i++) {
			System.out.println(i+" * "+m+" = "+(i*m));
		}
		

	}

}
