package com.oops_ass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Movie {
	private String mName;
	private String director;
	private String actor;
	
	public Movie(String mName, String director, String actor) {
		super();
		this.mName = mName;
		this.director = director;
		this.actor = actor;
	}
	
	
	static ArrayList<String> map = new ArrayList<>(); 
	
	static void ad(String rw) {
		map.add(rw);
	}
	
	static void dis() {
		for(int i=0; i<map.size();i++) {
			System.out.println(map.get(i));
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String msg ="";
		System.out.println("Enter the movie name :");
		String Name = sc.next();
		String dir = sc.next();
		String act = sc.next();
		
		Movie mv = new Movie(Name, dir, act);
		
		do {
		System.out.println("Enter the reivew of a movie :");
		String rw = sc.nextLine();
		Movie.ad(rw);
		
		System.out.println("Do you want continue :");
		msg = sc.next();
		
		}while(msg.equalsIgnoreCase("yes"));
		
		Movie.dis();

	}

}
