package com.day3;

import java.util.Scanner;

class CricketPlayers{
	protected String name;
	protected int age;
	protected String country;
	protected int height;
	protected int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	void display() {
		System.out.println("Player's Name is: " + name);
		System.out.println("Player's Age is: "+age);
		System.out.println("Player's Country is: "+country);
		System.out.println("Player's Height is: "+height);
		System.out.println("Player's Weight is: "+weight);
	}
	
	CricketPlayers(){
		System.out.println("***Player's Information***");
	}
	
	public CricketPlayers(String name,int age,String country,int height,int weight) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.height = height;
		this.weight = weight;
	}
}

class Batsman extends CricketPlayers{
	protected String name;
	protected float strikerate;
	protected String hand;
	protected float avg;
	protected int age;
	protected int highscore;
	
}

class Bowler extends CricketPlayers{
	protected String name;
	protected float economy;
	protected String hand;
	protected float avg;
	protected int age;
	protected int bestbowling;
	
}

public class Hierarchy {

	public static void main(String[] args) {		
		CricketPlayers cric = new CricketPlayers("Arjun",23,"India",60,70);
		cric.display();
	}

}
