package com.practiseproblem;

import java.util.ArrayList;
import java.util.Scanner;

class Movies {
	String title;
	String director;
	String actor;
	String review;

	Movies(String title, String director, String actor, String review) {
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.review = review;
	}

}

class AddRetrive {
	ArrayList<Movies> list1 = new ArrayList<>();

	void add(Movies m) {
		list1.add(m);
	}

	void retrive(String title) {
		for (Movies i : list1) {
			if (i.title.equalsIgnoreCase(title)) {
				System.out.println(i.title);
				System.out.println(i.review);
			}
		}
	}

}

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Movies M1 = new Movies("Leo", "loki", "Vijay", "Good");
		Movies M2 = new Movies("Mersal", "Atlee", "Vijay", "Good");
		Movies M3 = new Movies("Kathi", "Murugados", "Vijay", "Good");

		AddRetrive A1 = new AddRetrive();

		A1.add(M1);
		A1.add(M2);
		A1.add(M3);

		System.out.println("Enter the movie to get review : ");
		String rev = sc.next();
		A1.retrive(rev);

	}

}
