package com.day1;

import java.util.Scanner;

public class TableMul {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int x,s=0;
		  System.out.print("Enter the Table Number:");
		  x = sc.nextInt();
	      for(int i=1;i<=10;i++)
	      {
	            s=x*i;
	            System.out.println(s);
	      }

	}

}
