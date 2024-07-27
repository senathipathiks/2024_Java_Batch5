package com.assignments;

import java.util.ArrayList;
import java.util.Scanner;

class MusicLibraryOperation {
	String song;

	ArrayList<String> it = new ArrayList<>();

	Scanner s = new Scanner(System.in);

	void add_song() {
		System.out.println("Enter the Song name to add: ");
		String str = s.next();
		it.add(str);
		System.out.println("Song name gets added");
	}

	void del_song(String st) {
		for (int i = 0; i < it.size(); i++) {
			if (it.get(i).equalsIgnoreCase(st)) {
				it.remove(i);
				System.out.println("Removed");
			}
		}

	}

	Boolean rand_song(String d) {
		String ans = "";
		for (int i = 0; i < it.size(); i++) {
			if (it.get(i).equalsIgnoreCase(d)) {
				ans = it.get(i);
			}
		}
		return true;
	}

	void display() {
		System.out.println("Song Name : " + it);
	}

}

public class MusicLibrary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicLibraryOperation r = new MusicLibraryOperation();
		String msg = " ";
		do {
			System.out.println("1.Add Songs");
			System.out.println("2.Remove Songs ");
			System.out.println("3.Random Song");
			System.out.println("4.Display");
			System.out.println("5.Quit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				r.add_song();
				break;
			case 2:
				System.out.println("Enter the item to delete:");
				String del = sc.next();
				r.del_song(del);
				break;
			case 3:
				System.out.println("Enter the random song to display:");
				String d = sc.next();
				if (r.rand_song(d)) {
					System.out.println("Song Found");
				}
				break;
			case 4:
				r.display();
				break;
			case 5:
				System.exit(0);

			}
			System.out.println("Do yot want to continue [Yes|No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("yes"));
		sc.close();
	}

}