package com.lms.main;

import com.lms.bean.Student;
import com.lms.dao.*;

import java.sql.SQLException;
import java.util.Scanner;

public class SmsMain {
	static Scanner in = new Scanner(System.in);

	public static int menu() {
		int ch;
		System.out.println("-------------Menu-------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. View All");
		System.out.println("4. Update");
		System.out.println("5. Find");
		System.out.println("6. Exit");
		System.out.println("------------------------------");
		System.out.print("Enter your choice: ");
		ch = in.nextInt();
		return ch;
	}

	public static Student enterDetails() {
		System.out.println("Enter Student Id, Name, City, Mobile");
		return (new Student(in.nextInt(), in.next(), in.next(), in.next()));
	}

	public static void main(String[] args) throws SQLException {
		SmsDao dao = new SmsDao();
		String ch;
		do {
			switch (menu()) {
			case 1: {
				Student student = enterDetails();
				int n = dao.insert(student);
				if (n > 0) {
					System.out.println("Student Record Inserted Successfully");
				}
				break;
			}
			case 2: {
				System.out.print("Enter Student Id: ");
				int id = in.nextInt();
				int n = dao.delete(id);
				if (n <= 0) {
					System.out.println("No Records Found !!!");
				} else {
					System.out.println("Record Deleted successfully");
				}
				break;
			}
			case 3: {
				int n = dao.viewAll();
				if (n <= 0) {
					System.out.println("No Records Found !!!");
				}
				break;
			}
			case 4: {
				Student student = enterDetails();
				int n = dao.update(student);
				if (n > 0) {
					System.out.println("Student Record Updated Successfully");
				}
				break;
			}
			case 5: {
				System.out.print("Enter Student Id: ");
				int id = in.nextInt();
				int n = dao.find(id);
				if (n <= 0) {
					System.out.println("No Records Found !!!");
				}

				break;
			}
			case 6: {
				System.exit(0);
			}
			default:
				System.out.println("Enter valid Choice...");
			}

			System.out.println("Do you want to continue: (Yes/NO)");
			ch = in.next();
		} while (ch.equalsIgnoreCase("yes"));
	}
}
