package com.day4;

abstract class CrickerPlayer{
	private String name;
	private int age ;
	CrickerPlayer(String name,int age) {
		this.name = name;
		this.age = age;
	}
	abstract void display();
	
	void display1() {
		System.out.println("The name of the player : " + name);
		System.out.println("The age of the player : " + age);
	}
}

class Batsman extends CrickerPlayer{
	private int strikerate;
	private int avg;
	private int highScore;
	 Batsman(String name,int age,int strikerate,int average,int highScore) {
		super(name,age);
		this.strikerate = strikerate;
		this.avg = average;
		this.highScore = highScore;
		
	}
	void display() {
		System.out.println("The Batsman");
		System.out.println("The Strike Rate of the player : " + strikerate);
		System.out.println("The Avarage of the player : " + avg);
		System.out.println("The High Score of the player : " + highScore);
	}
}

class Bowler extends CrickerPlayer{
	private int economy;
	private int wickets;
	private int bestspell;
	 public Bowler(String name,int age,int economy,int wickets,int bestspell) {
		super(name,age);
		this.economy = economy;
		this.wickets = wickets;
		this.bestspell = bestspell;
		
	}
	void display() {
		System.out.println("The Bowler");
		System.out.println("The speed of the player : " + economy);
		System.out.println("The Avarage of the player : " + wickets);
		System.out.println("The High Score of the player : " + bestspell);
	}
}

public class Final {

	public static void main(String[] args) {
		CrickerPlayer obj1 = new Batsman("Gopi", 25, 57, 45, 200);
		CrickerPlayer obj2 = new Bowler("Siva", 24, 56, 90, 300);
		obj1.display1();
		obj1.display();
		obj1.display1();
		obj2.display();

	}

}
