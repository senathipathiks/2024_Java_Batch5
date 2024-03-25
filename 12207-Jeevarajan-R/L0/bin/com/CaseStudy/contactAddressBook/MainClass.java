package CaseStudy.contactAddressBook;

import java.util.Scanner;


public class MainClass {
	
	
	public static void menu() {
		System.out.println("1. Add Contact");
		System.out.println("2. Update Contact");
		System.out.println("3. Delete Contact");
		System.out.println("4. Find Contact");
		System.out.println("5. View All Contact");
		System.out.println("6. Exit / Quit");
		System.out.println("-------------------------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg = "";
		AddressBook ab = new AddressBook();
		
		do {
			menu();
			System.out.println("Enter you Choice");
			int choice = sc.nextInt();
				
			switch(choice) {
			case 1:
				System.out.println("Enter Contact First Name, Last Name, email ID and Mobile number");
				Contact ct = new Contact(sc.next(),sc.next(),sc.next(),sc.nextInt());
				if(ab.addContact(ct)) {
					System.out.println("Contact Added Successfully");
				} else {
					System.out.println("Contact Not Added");
				}
				break;
			case 2:
				System.out.println("Enter Contact First Name, Last Name, email ID and Mobile number");
				Contact Upct = new Contact(sc.next(),sc.next(),sc.next(),sc.nextInt());
				if(ab.updateContact(Upct)) {
					System.out.println("Contact Updated Successfully");
				} else {
					System.out.println("Contact Not Updated Added");
				}
				break;
			case 3:
				System.out.println("Enter the Contact Full Name to Delete : ");
				String delName = sc.next();
				if(ab.deleteContact(delName)) {
					System.out.println("Employee Record Deleted.");
				} else {
					System.out.println("Employee Record Not Found.");
				}
				break;
			case 4:
				System.out.println("Enter the Contact Full Name to find : ");
				String findName = sc.next();
				Contact Fct = ab.findContact(findName);
				if(Fct != null ) {
					Fct.display();
				} else {
					System.out.println("Contact Not Found!!");
				}
				break;
			case 5:
				ab.viewAllContact();
				break;
			default:
				break;
			}
			System.out.println("Do you need to continue [YES/NO]: ");
			msg = sc.next();
		}while(msg.equalsIgnoreCase("yes"));
		sc.close();

	}

}
