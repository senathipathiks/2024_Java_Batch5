package com.contact;

import java.util.Scanner;


public class myMain {
	
	static public void menu() {
		System.out.println("1. Add Contact");
		System.out.println("2. update Contact");
		System.out.println("3. delete Contact");
		System.out.println("4. find Contact");
		System.out.println("5. find all Contact");
		System.out.println("6. quit/Exit Contact");
		
		System.out.println("Enter you choice:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		method met = new method();
		do {
			menu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Mobile Number , first Name , Last Name and email: ");
				addressBook con = new addressBook(sc.nextInt(), sc.next(), sc.next(), sc.next());
				if (met.addContact(con)) {
					System.out.println("Contact Added");
				}
				else {
					System.out.println("Contact Not Added");

				}
				break;
				
			case 2:
				System.out.println("Enter Mobile Number , first Name , Last Name and email: ");
				addressBook con1 = new addressBook(sc.nextInt(), sc.next(), sc.next(), sc.next());
		        if(met.updateContact(con1))
		        	System.out.println("contact updated");
				else
					System.out.println("Contact not found");

				break;
				
			case 3:
				System.out.println("Enter the mobile number to delete:");
				int mobNo = sc.nextInt();
				met.deleteContact(mobNo);
				break;
				
			case 4:
				System.out.println("Enter the mobile Number to find");
				int mobNo1 = sc.nextInt();
				addressBook m = met.findContact(mobNo1);
				if(m!=null)
					m.display();
				else
					System.out.println("contact not found");
				break;
				
			case 5:
				met.viewAllContact();
				break;
				
			case 6:
				System.exit(0);
				break;
			}
		System.out.println("Do you want to continue [yes/ no]");
		msg = sc.next();
		
		}while(msg.equalsIgnoreCase("Yes"));
		}
	}


