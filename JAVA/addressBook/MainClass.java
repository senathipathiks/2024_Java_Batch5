package addressBook;

import java.util.Scanner;

public class MainClass {
	static public void menu() {
		System.out.println("1 .Add Contact");
		System.out.println("2 .Update Contact");
		System.out.println("3 .Delete Contact");
		System.out.println("4 .Find Contact");
		System.out.println("5 .Find All Contact");
		System.out.println("6 .Quit / Exit");

		System.out.println("Enter your choice");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg;
		AddressBook ems = new AddressBook();
		do {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter FirstName ,LastName,mobile number,email");
				Contact emp = new Contact(sc.next(), sc.next(), sc.nextDouble(), sc.next());
				if (ems.addContact(emp)) {
					System.out.println("Contact added");
				} else {
					System.out.println("Contact not added");
				}
				break;
			case 2:
				System.out.println("Enter FirstName ,LastName,mobile number,email");
				Contact emp1 = new Contact(sc.next(), sc.next(), sc.nextDouble(), sc.next());
				if (ems.UpdateContact(emp1)) {
					System.out.println("Contact updated");
				} else {
					System.out.println("Contact not found");
				}
				break;
			case 3:
				System.out.println("Enter the First Name to delete: ");
				String id1 = sc.next();
				if (ems.deleteContact(id1)) {
					System.out.println("Contact object removed");
				} else {
					System.out.println("Contact not found");
				}
				break;
			case 4:
				System.out.println("Enter the First Name to find : ");
				String id = sc.next();
				Contact e = ems.findContact(id);
				if (e != null) {
					e.display();
				} else {
					System.out.println("Contact is not present");
				}
				break;
			case 5:
				ems.viewAllContact();
				break;
			case 6:
				System.exit(choice);
				break;
			}
			System.out.println("Do you want to continue [Yes | NO]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
	}

}