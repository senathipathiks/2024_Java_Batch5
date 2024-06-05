package basic_coding;

import java.util.Scanner;

//*****
//****
//***
//**
//*
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		for(int i=0; i<rows;i++) {
			for(int j=0; j<rows-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	}


