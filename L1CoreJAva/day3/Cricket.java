package com.day3;
class CricketPlayer{
	String name;
	String dob;
	String city;
	String nation;
	CricketPlayer(String name,String dob,String city,String nation){
		this.name=name;
		this.dob=dob;
		this.city=city;
		this.nation=nation;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("dob: "+dob);
		System.out.println("City: "+city);
		System.out.println("Nation: "+nation);
	}
}
class Batsman extends CricketPlayer{
	int runs;
	String batting;
	int centuries;
	int bestscore;
	Batsman(String name,String dob,String city,String nation,int runs,String batting,int centuries,int bestscore)
	{
		super(name,dob,city,nation);
		this.runs=runs;
		this.batting=batting;
		this.centuries=centuries;
		this.bestscore=bestscore;
	}
	void display() {
		super.display();
		System.out.println("Runs: "+runs);
		System.out.println("Batting: "+batting);
		System.out.println("Centuries: "+centuries);
		System.out.println("BestScore: "+bestscore);
	}
}
class Bowler extends CricketPlayer{
	int wickets;
	int economy;
	Bowler(String name,String dob,String city,String nation,int wickets,int economy){
		super(name,dob,city,nation);
		this.wickets=wickets;
		this.economy=economy;
	}
	void display() {
		super.display();
		System.out.println("wickets: "+wickets);
		System.out.println("Economy: "+economy);
	}
}
public class Cricket {

	public static void main(String[] args) {
		
		Batsman b1 = new Batsman("vicky","august4","kvp","india",4500,"right",50,234);
		b1.display();
		System.out.println("------------------------------------------------------------");
		Bowler b2 = new Bowler("Bumrah","dec6","mum","india",560,7);
		b2.display();

	}

}
