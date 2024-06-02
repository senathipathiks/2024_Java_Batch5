package com.contact;

import java.util.Scanner;

public class ContectMain {

	static public void menu() {
		System.out.println("1. Add Contact");
		System.out.println("2. Update Contact");
		System.out.println("3. Delete Contavt");
		System.out.println("4. Find Contact");
		System.out.println("5. Find All Contact");
		System.out.println("6. Quit / Exit");

		System.out.println("Enter Your Choice");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		
		Method md = new Method();
		
		do {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Enter the details to add the contact \nPhone Number, First Name, Last Name, Email, Address");
				AddressBook con = new AddressBook(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
				if ( md.addContect(con)) {
					System.out.println("Contact Details are Saved :) ");
				}
				else {
					System.out.println("Contact Details are Not Saved  :( ");
				}
				break;
				
			case 2:
				System.out.println("Enter The details to update :\nContact Phone Number ,First Name, Last Name, Email and Address");
				AddressBook con1 = new AddressBook(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
				if( md.updateContact(con1) ) {
					System.out.println("The Contact Details is updated :) ");
				}
				else {
					System.out.println("Contact Details Not Added :( ");	
				}
				break;
				
			case 3:
				System.out.println("Enter The Contact phone number to delete :");
				String x1 = sc.next();
				if((md.deleteContact(x1))) {
					System.out.println("The Contact details removed");
				}
				else {
					System.out.println("The Contact Details Not Present In Address Book Data");
				}
				break;
				
			case 4:
				System.out.println("Enter The Contact Phone Number to Find :");
				String x = sc.next();
				AddressBook con2 = md.findContact(x);
				if(con2 != null) {
					System.out.println("The Contact Phone Number "+con2.getPhoneNumber() +" Present In Contact Data \n");
					
					con2.display();
				}
				else {
					System.out.println("The COntact Not Present In Contact Data");
				}
				break;
				
			case 5:
				md.viewAllContact();
				break;
				
			case 6:
				System.exit(0);
				break;
			}
			
			System.out.println("Do you want to continue [ YES / NO ]");
			msg = sc.next();
			
		}
		while(msg.equalsIgnoreCase("YES"));

	}

}
