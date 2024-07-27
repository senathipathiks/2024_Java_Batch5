package mypackage;

import java.util.Scanner;


public class MainClass
{
	static public void menu()
	{
		System.out.println("1. Add Contact");
		System.out.println("2. Update Contact");
		System.out.println("3. Delete Contact");
		System.out.println("4. Find Contact");
		System.out.println("5. View Contact");
		System.out.println("6. Exit / Quit");

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String msg = "";
		AddressBook book = new AddressBook();
		do {
			menu();
			
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
			System.out.println("Enter First Name, Last Name, Email Id, Mobile No");
			Contact add = new Contact(sc.next(), sc.next(), sc.next(),sc.nextLong());
			if(book.add(add))
			{
				System.out.println("Contact Added Successfully");
			}
			else
			{
				System.out.println("Contact Not Added");
			}
			break;
			case 2:
				System.out.println("Enter First Name, Last Name, Email Id, Mobile No");
				Contact upd = new Contact(sc.next(), sc.next(), sc.next(),sc.nextLong());
				if(book.update(upd)) {
					System.out.println("Contact Updated Successfully");}
				else {
					System.out.println("Contact Not Updated");}
				break;
			case 3:
				System.out.println("Enter the first name to delete :");
				String mn = sc.next();
				if(book.delete(mn))
					System.out.println("Contact deleted Successfully ");
				else
					System.out.println("Contact not deleted");
				break;
			case 4:
				System.out.println("Enter the first name to find :");
				String findEm = sc.next();
				Contact c = book.find(findEm);
				if(c!=null) {
					c.display();
			}
				else {
					System.out.println("Contact not found");
				}
				break;
			case 5:
				System.out.println("----Contact list----");
				book.view();
				break;
			case 6:
				System.exit(0);
			}
			System.out.println("Do you want to continue [yes | no]");
			msg = sc.next();
		}
		while(msg.equalsIgnoreCase("yes"));
	}

}
