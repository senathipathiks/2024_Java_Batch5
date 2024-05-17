package com.day2;
import java.util.Arrays;
import java.util.Scanner;
public class Day2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0]=new int[]{1,2,3};
		arr[1]= new int[]{4,5};
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+"");
			}
			System.out.println("");
		}
		
	}

}
