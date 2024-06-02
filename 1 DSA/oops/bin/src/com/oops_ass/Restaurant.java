package com.oops_ass;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

	private float rate;
	private String item;
	private int price;
	
	static public void menu() {
		System.out.println("1. Add item");
		System.out.println("2. Delete item");
		System.out.println("3. Display item");
		System.out.println("4. Avg rating");
		System.out.println("5. Quit / Exit");

		System.out.println("Enter Your Choice");
	}
	
	public Restaurant(float rate, String item, int price) {
		super();
		this.rate = rate;
		this.item = item;
		this.price = price;
	}

	public static void main(String[] args) {
	
		var sc = new Scanner(System.in);
		ArrayList<Restaurant> al = new ArrayList<Restaurant>();
		String msg = "";
		
		do {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Enter the details rate, item, price:");
				float rate = sc.nextFloat();
				String item = sc.next();
				int price =sc.nextInt();
				Restaurant re = new Restaurant(rate, item, price);
				al.add(re);
				break;
			
			case 2:
				al.remove(al.size()-1);
				break;
			
			case 3:
				for(Restaurant s : al) {
					System.out.println(s.item);
				}
				break;
				
			case 4:
				int x=0;
				double y=0;
				for(Restaurant s : al) {
					y =y+ s.rate;
					x++;
				}
				System.out.println(y/x);
				break;
				
			case 5:
				System.exit(0);
				break;
			}
				
				System.out.println("Do you want to continue [ YES / NO ]");
				msg = sc.next();
		}
	
		while(msg.equalsIgnoreCase("yes"));
	
	
	}

}
