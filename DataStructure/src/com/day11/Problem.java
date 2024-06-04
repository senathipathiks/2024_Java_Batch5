package com.day11;

import java.util.Scanner;

class Movie{
	String title;
	String director;
	String actors;
	String reviews;
	
	Movie(String title,String director,String actors,String reviews){
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.reviews = reviews;
	}
	
	void retrive() {
		System.out.println(title);
		System.out.println(director);
		System.out.println(actors);
		System.out.println(reviews);
	}
	
}
public class Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie a  = new Movie(sc.next(),sc.next(),sc.next(),sc.next());
		a.retrive();
	}

}
