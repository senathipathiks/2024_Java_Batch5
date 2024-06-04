package com.day10;
import java.util.Scanner;

public class MainClass {

	public static void menu() {
		System.out.println("1. Add Contact");
		System.out.println("2. Update Contact");
		System.out.println("3. Delete Contact");
		System.out.println("4. Find Contact");
		System.out.println("5. FindAll Contact");
		System.out.println("6. Quit Contact");

		System.out.println("Enter your choice : ");

	}
	
	
	public static void main(String[] args) {
		Scanner lg = new Scanner(System.in);
		String msg = "";
		AddressBook ab = new AddressBook();

		do {
			menu();
			int choice = lg.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter First_Name, Last_Name, Email, and Mobile Number ");
				Contact cont = new Contact(lg.next(), lg.next(), lg.next(), lg.nextDouble());
				
				if (ab.addContact(cont)) {
					System.out.println("Contact Object is Added");
				} else {
					System.out.println("Contact Object is not Added");

				}
				break;
			case 2:
				System.out.println("Enter First_Name, Last_Name, Email, and Mobile Number ");
				Contact cont1 = new Contact(lg.next(), lg.next(), lg.next(), lg.nextDouble());
				if (ab.updateContact(cont1)) {
					System.out.println("Contact Object Updated");
				} else {
					System.out.println("Contact Object not Updated");
				}
				break;
			case 3:
				System.out.println("Enter First_Name");
				String cont2 = lg.next();
				if (ab.deleteEmployee(cont2)) {
					System.out.println("Employee Object removed");
				} else {
					System.out.println("Employee Object not removed");
				}
				break;
			case 4:
				System.out.println("Enter First_Name, Last_Name, Email, and Mobile Number ");
				String firstName = lg.next();
				Contact cont3 = ab.findEmployee(firstName);

				if (cont3 != null) {
					ab.display();
				} else {
					System.out.println("Not found");
				}
				break;
			case 5:
				ab.viewAllContact();
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue Yes| No : ");
			msg = lg.next();

		} while (msg.equalsIgnoreCase("Yes"));
		
	}
  
}