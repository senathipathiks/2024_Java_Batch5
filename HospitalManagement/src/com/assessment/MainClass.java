package com.assessment;

import java.util.Scanner;

public class MainClass {

	static public void menu() {
		System.out.println("*********Doctor Managment System********** ");
		System.out.println("1. Add Doctor");
		System.out.println("2. Find Doctor");
		System.out.println("3. Update Doctor");
		System.out.println("4. Delete Doctor");
		System.out.println("5. View All Doctor");
		System.out.println("Enter your choice:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg = "";
		DoctorManagement dmgnt = new DoctorManagement();
		do {
			menu();
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter the doctorId, firstName, lastName, email, mobile number to add");
				Doctor d = new Doctor(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextLong());
				if (dmgnt.addDoctor(d)) {
					System.out.println("Docor details are successfully Added");
				} else {
					System.out.println("Doctor details are failed");
				}
				break;
			case 2:
				System.out.println("Enter the doctorId to find");
				int num = sc.nextInt();
				Doctor doc = dmgnt.findDoctor(num);
				if (doc != null) {
					doc.display();
				} else {
					System.out.println("Doctor details are failed");
				}
				break;
			case 3:
				System.out.println("Enter the doctorId, firstName, lastName, email, mobile number to update ");
				Doctor d1 = new Doctor(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextLong());
				if (dmgnt.updateDoctor(d1)) {
					System.out.println("Docor details are successfully Updated");
				} else {
					System.out.println("Doctor details are failed");
				}
				break;
			case 4:
				System.out.println("Enter the doctorId to delete");
				int number = sc.nextInt();
				if (dmgnt.deleteDoctor(number)) {
					System.out.println("Docor details are successfully Deleted");
				} else {
					System.out.println("Doctor details are failed");
				}
				break;
			case 5:
				dmgnt.viewDoctors();
				break;
			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
	}

}
