package com.practiseproblem;

import java.util.Scanner;

class flightandhotels {
	Scanner sc = new Scanner(System.in);
	int flightcount = 5;
	int hotelroom = 10;
	
	void AflightBook() {
		System.out.println("Available ticket on flight "+flightcount);
		System.out.println("If you want to book a flight : [yes/no]");
		String msg= sc.next();
		if(msg.equals("yes")) {
			flightcount--;
			
		}
		
		
	}
	void AflightCancel() {
		System.out.println("Available ticket on flight "+flightcount);
		System.out.println("If you want to cancel a reservation for flight : [yes/no]");
		String msg= sc.next();
		if( msg.equals("yes")) {
			flightcount++;
		}
		
		
	}

	void AhotelBook() {
		System.out.println("Available room on hotel "+hotelroom);
		System.out.println("If you want to book room : [yes/no]");
		String msg= sc.next();
		if(msg.equals("yes")) {
			flightcount--;
		}
		
	}
	void AhotelCancel() {
		System.out.println("Available room on hotel "+hotelroom);
		System.out.println("If you want to cancel a booked room : [yes/no]");
		String msg= sc.next();
		if(msg.equals("yes")) {
			flightcount++;
		}

	}
	
}

public class FlightAndHotel {
	static void menu() {
		System.out.println("1. Book Flight :");
		System.out.println("2. Cancel Flight :");
		System.out.println("3. Book hotel :");
		System.out.println("4. Cancel hotel :");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		flightandhotels obj1 = new flightandhotels();
		while(true) {
			menu();
			System.out.println("Enter the choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				obj1.AflightBook();
				break;
			case 2:
				obj1.AflightCancel();
				break;
			case 3:
				obj1.AhotelBook();
				break;
			case 4:
				obj1.AhotelCancel();
				break;
			}
			
			
			System.out.print("Do you want to continue [yes/no] ");
			String msg = sc.next();
			if(msg.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		
		
		
	}

}
