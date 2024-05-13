package com.day1;

import java.util.Scanner;

public class MainClass {
			
	static public void menu() {
		System.out.println("1. Add Customer");
		System.out.println("2. Find Customer ");
		System.out.println("3. Update Customer");
		System.out.println("4. Delete Customer");
		System.out.println("5. ViewAll Customer");
		System.out.println("6. Exit/Quit");
		System.out.println("Enter your choice: ");
	}
	
 public static void main(String[] args){
				
		Scanner s = new Scanner(System.in);
		CustomerManagement cmt = new CustomerManagement();
		String msg;
		
		do {
			menu();
			int choice = s.nextInt();
			
			switch (choice){
			
			case 1:
				System.out.println("Enter customer ID, Name, Email, Age");
				Customer cust = new Customer(s.nextInt(), s.next(), s.next(),s.nextInt());
				if(cmt.addCustomer(cust)) {
					System.out.println("Customer Object Added");
				}
				else {
					System.out.println("Customer Object Not Added");
				}
				break;
				
			case 2:
				System.out.println("Enter the Customer Id to find: ");
				int id = s.nextInt();
				Customer e = cmt.findCustomer(id);
				if(e!=null) {
					e.display();
				}
				else {
					System.out.println("Element not found");
				}
				break;
				
			case 3:
				System.out.println("Enter customer ID");
				int i = s.nextInt();
				System.out.println("Enter customer ID, Name, Email, Age to update : ");
				Customer cmt1 = new Customer(s.nextInt(), s.next(), s.next(),s.nextInt());
				
				if(cmt.updateCustomer(i,cmt1)) {
					System.out.println("Updated");
				}
				else {
					System.out.println("Not Updated");
				}
				break;
				
			case 4:
				System.out.println("Enter the Customer Id to delete: ");
				int id1 = s.nextInt();
				if(cmt.deleteCustomer(id1)) {
					System.out.println("Customer Object Removed");
				}
				else {
					System.out.println("Customer Object Not Removed");
				}
				break;
				
			case 5:
				cmt.viewallCustomer();
				break;
				
			case 6:
				System.out.println("Process Over");
				System.exit(0);
				break;
				
			}
			
			System.out.println("Do you want to continue [Yes | No]");
			msg = s.next();
			
		} while (msg.equalsIgnoreCase("yes"));
		s.close();
				
			
   }
}
