package com.day1;

import java.util.Scanner;

public class NoDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Month:");
			String mon = sc.next();
			int days=30,days1=31,leapfeb=29,feb=28;
			
			if(mon.equalsIgnoreCase("January")) {
				System.out.println("January has "+days1+" days");
			}
			else if(mon.equalsIgnoreCase("FebruaryLeap")){
				System.out.println("February Leap year has "+leapfeb+" days");
			}
			else if(mon.equalsIgnoreCase("February")){
				System.out.println("February has "+feb+" days");
			}
			else if(mon.equalsIgnoreCase("March")){
				System.out.println("February has "+days1+" days");
			}
			else if(mon.equalsIgnoreCase("April")){
				System.out.println("February has "+days+" days");
			}
			else if(mon.equalsIgnoreCase("May")){
				System.out.println("February has "+days1+" days");
			}
			else if(mon.equalsIgnoreCase("June")){
				System.out.println("February has "+days+" days");
			}
			else if(mon.equalsIgnoreCase("July")){
				System.out.println("February has "+days1+" days");
			}
			else if(mon.equalsIgnoreCase("August")){
				System.out.println("February has "+days1+" days");
			}
			else if(mon.equalsIgnoreCase("September")){
				System.out.println("February has "+days+" days");
			}
			else if(mon.equalsIgnoreCase("October")){
				System.out.println("February has "+days1+" days");
			}
			else if(mon.equalsIgnoreCase("November")){
				System.out.println("February has "+days+" days");
			}
			else if(mon.equalsIgnoreCase("December")){
				System.out.println("February has "+days1+" days");
			}
		}
	}
