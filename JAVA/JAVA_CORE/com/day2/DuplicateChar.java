package com.day2;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]=new String[3];
		String str1[]=new String[6];
//		str=sc.next();
		for(int i =0;i<3;i++)
		{
			str[i]=sc.next();
		}
		int j=0;
		for(int i =0;i<6;i+=2)
		{
			str1[i]=str[j];
			str1[i+1]=str[j];
			j++;
		}
//		System.out.println(str1);
		for(int i =0;i<6;i++)
		{
			System.out.println(str1[i]);
		}

	}

}
