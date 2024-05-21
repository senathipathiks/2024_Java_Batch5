package AddressBook;

import java.util.Scanner;

public class MainClass {
	static void menu() {
		System.out.println("**** Address Book ****");
		System.out.println("1 : Add Contact.");
		System.out.println("2 : Update Contact.");
		System.out.println("3 : Delete Contact.");
		System.out.println("4 : Find Contact.");
		System.out.println("5 : ViewAll Contact.");

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		AddressBook ab = new AddressBook();
		do {
			MainClass.menu();
			System.out.println("Enter the choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Firstname,Lastname,Phone Number,EmailId : ");
				Contact c1 = new Contact(sc.next(), sc.next(), sc.next(), sc.next());
				if (ab.addContact(c1)) {
					System.out.println("Added succesfully");
				} else {
					System.out.println("Not added");
				}
				break;
			case 2:
				System.out.println("Enter Firstname,Lastname,Phone Number,EmailId : ");
				Contact c2 = new Contact(sc.next(), sc.next(), sc.next(), sc.next());
				
				if(ab.updateContact(c2)) {
					System.out.println("Updated successfully.");
				} else {
					System.out.println("Data not found.");
				}
				break;
			case 3:
				System.out.println("Enter Firstname to delete: ");
				
				String firstName= sc.next();
				
				if(ab.deleteContact(firstName)) {
					System.out.println("Deleted successfully.");
				} else {
					System.out.println("Data not found.");
				}
				break;
			case 4:
				System.out.println("Enter firstname : ");
				String f1 = sc.next();
				ab.findContact(f1);
				break;
			case 5:
				ab.viewall();
				break;

			}

			System.out.println("Do you want to continue : [Yes || No] : ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("yes"));
		System.out.println("Application closed.");
	}

	

}
