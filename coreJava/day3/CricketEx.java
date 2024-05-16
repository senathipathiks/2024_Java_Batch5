package com.day3;
class CricketPlayer
{
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
class Batsman extends CricketPlayer
{
	int average;
	int strikerate;
	String batingStyle;
	int highScore;
	int runs;
	public Batsman(String name, String dob, String city, String nation, int average, int strikerate, String batingStyle,
			int highScore, int runs) {
		super(name, dob, city, nation);
		this.average = average;
		this.strikerate = strikerate;
		this.batingStyle = batingStyle;
		this.highScore = highScore;
		this.runs = runs;
	}
}
	
}
class Bowler extends CricketPlayer
{
	float economy;
	int wickets;
	int fivewickethaul;
	String blowingStyle;
	public Bowler(String name, String dob, String city, String nation, float economy, int wickets, int fivewickethaul,
			String blowingStyle) {
		super(name, dob, city, nation);
		this.economy = economy;
		this.wickets = wickets;
		this.fivewickethaul = fivewickethaul;
		this.blowingStyle = blowingStyle;
	}
	
}
public class CricketEx {
 
	public static void main(String[] args) {
		Bowler b=new Bowler("vidhu","08-01-2002","Nellai","India",12.3,6,2,"spinner");
 
	}
 
}
 
