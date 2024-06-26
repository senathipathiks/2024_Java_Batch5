package com.gopi.menuacc;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gopi.menuacc.Account;

/**
 * Hello world!
 *
 */
public class App {
	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		int choice;

		System.out.println("-----ACCOUNT MENU-------");
		System.out.println("1. Insert New Account");
		System.out.println("2. Delete The Account");
		System.out.println("3. View All Account Details");
		System.out.println("4. Update Account Details");
		System.out.println("5. Find By Id");
		System.out.println("6. Exit");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		String ch = "";
		do {
			switch (displayMenu()) {
			case 1:
				Session sessions = sf.openSession();

				Transaction txs = sessions.beginTransaction();
				System.out.println("---------------------------------------------");
				System.out.println("Insertion");
				System.out.print("Enter the Account Id:");
				int accId = sc.nextInt();
				System.out.print("Enter the Account Number:");
				int accNum = sc.nextInt();
				System.out.print("Enter the Account Type:");
				String accType = sc.next();
				System.out.print("Enter the Bank Name:");
				String accBank = sc.next();
				System.out.print("Enter the Bank Branch Name:");
				String accBranch = sc.next();
				Account a1 = new Account(accId,accNum, accType, accBank, accBranch);
				try {
				if (a1 != null) {
					sessions.save(a1);
					txs.commit();
					System.out.println("Record Inserted Successfully");
				} else
					System.out.println("Record Insertion Failure");
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				break;

			case 2:

				System.out.println("Enter the Account ID to Delete");
				int id = sc.nextInt();
				Account a2 = session.find(Account.class, id);
				session.delete(a2);
				tx.commit();
				if (a2 != null)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion Failure");
				break;

			case 3:
				ArrayList<Account> list = (ArrayList) session.createQuery("From Account").list();
				for (Account acc : list) { // find all
					System.out.println(acc);
				}
				if (list == null)
					System.out.println("No Records Found ");
				break;

			case 4:
				System.out.println("Enter the Account ID to Update");
				int id1 = sc.nextInt();
				Account a3 = session.find(Account.class, id1);
				if (a3 != null) {
					Session session1 = sf.openSession();

					Transaction tx1 = session1.beginTransaction();
					System.out.print("Enter the Account Number:");
					int accNum1 = sc.nextInt();
					System.out.print("Enter the Account Type:");
					String accType1 = sc.next();
					System.out.print("Enter the Bank Name:");
					String accBank1 = sc.next();
					System.out.print("Enter the Bank Branch Name:");
					String accBranch1 = sc.next();
					a3.setAccNum(accNum1);
					a3.setAccType(accType1);
					a3.setBank(accBank1);
					a3.setBranch(accBranch1);
					session1.update(a3);
					tx1.commit();
					System.out.println("Record Updated Successfully");
				} else
					System.out.println("No Rcord Found");
				break;

			case 5:
				System.out.println("Enter the Account ID to Find");
				int id3 = sc.nextInt();
				Account a4 = session.find(Account.class, id3);
				if (a4 != null) {
					ArrayList<Account> list1 = (ArrayList) session.createQuery("From Account").list();
					for (Account acc : list1) { // find all
						System.out.println(acc);
					}
					System.out.println("Record Found Successfully");
				} else {
					System.out.println("No Record Found");
				}
				break;

			}
			System.out.println("Do  you want to continue (YES/NO)");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("yes"));

//        Employee u1 = new Employee(13,"gopi","Chennai");  //create and insert

//        Employee u2 = session.find(Employee.class,13); // for find the id

//        session.delete(u2); // delete must give commit

//        Employee u1 = new Employee(10,"siva","Chennai"); // insert new values must give commit

//        u2.setCity("VNR");  // set values for updation

//        session.save(u1); //save for create

//        System.out.println(u1);

//        session.update(u2); // updation 

	}

}
