package com.day1;

import java.util.Scanner;

public class DayToNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
		System.out.print("Enter the Day in Number:");
		int day = s.nextInt();
		
		if(day==1) {
			System.out.print("Monday!");
		}
		else if(day==2){
			System.out.print("Tuesday!");
		}
		else if(day==3){
			System.out.print("Wednesday!");
		}
		else if(day==4){
			System.out.print("Thursday!");
		}
		else if(day==5){
			System.out.print("Friday!");
		}
		else if(day==6){
			System.out.print("Saturday!");
		}
		else{
			System.out.print("Sunday!");
		}
	}
}
