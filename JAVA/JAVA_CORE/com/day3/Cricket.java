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
	void display()
	{
		System.out.println("dob:"+dob);
		System.out.println("Name:"+name);
		System.out.println("city:"+city);
		System.out.println("Nation:"+nation);
	}
}
class Batsman extends CricketPlayer
{
	int average;
	int strikerate;
	String batingStyle;
	int highScore;
	int runs;
	Batsman(String name, String dob, String city, String nation, int average, int strikerate, String batingStyle,
			int highScore, int runs) {
		super(name, dob, city, nation);
		this.average = average;
		this.strikerate = strikerate;
		this.batingStyle = batingStyle;
		this.highScore = highScore;
		this.runs = runs;
	}
	void display() {
		super.display();
		System.out.println("Average: "+average);
		System.out.println("Strikerate: "+strikerate);
		System.out.println("BatingStyle: "+batingStyle);
		System.out.println("HighScore: "+highScore);
		System.out.println("Runs: "+runs);
	}
}
class Bowler extends CricketPlayer
{
	float economy;
	int wickets;
	int fivewickethaul;
	String blowingStyle;
	Bowler(String name, String dob, String city, String nation, float economy, int wickets, int fivewickethaul,
			String blowingStyle) {
		super(name, dob, city, nation);
		this.economy = economy;
		this.wickets = wickets;
		this.fivewickethaul = fivewickethaul;
		this.blowingStyle = blowingStyle;
	}
	void display() {
		super.display();
		System.out.println("Economy: "+economy);
		System.out.println("Wickets: "+wickets);
		System.out.println("fivewickethaul: "+fivewickethaul);
		System.out.println("blowingStyle: "+blowingStyle);
	
	}
}
public class Cricket {

	public static void main(String[] args) {
		
		System.out.println("-------Batsman-------");
		Batsman b1 = new Batsman("jada","08-01-2003","Nellai","India",45,200,"left",123,4500);
		b1.display();
		System.out.println("-------------------------------------------");
		System.out.println("------Bowler------");
		Bowler bo=new Bowler("jada","08-01-2003","Nellai","India",12,2,3,"Spinner");
		bo.display();
		
	}

}
