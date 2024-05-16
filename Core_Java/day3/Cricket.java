package com.day3;

class CricketPlayer{
	private String name;
	private String dob;
	private String nation;
	private double height;
	private double weight;
	
	CricketPlayer(String name, String dob, String nation, double height, double weight ){
		this.name = name;
		this.dob = dob;
		this.nation = nation;
		this.height = height;
		this.weight = weight;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("DOB:"+dob);
		System.out.println("Nation:"+nation);
		System.out.println("Height:"+height);
		System.out.println("Weight:"+weight);
	}
}
class Batsman extends CricketPlayer{
	String batting;
	int run;
	int bestscore;
	Batsman(String name, String dob, String nation, double height, double weight,String batting, int run, int bestscore){
																									super(name,dob,nation,height,weight);
		this.batting = batting;
		this.run = run;
		this.bestscore = bestscore;
	}
	void display() {
		System.out.println("------------Batsman Info-------------");
		super.display();
		System.out.println("Batting:"+batting);
		System.out.println("Run:"+run);
		System.out.println("BestScore:"+bestscore);
		System.out.println("-------------------------------");
	}
}
class Bowler extends CricketPlayer{
	double economy;
	int wickets;
	Bowler(String name, String dob, String nation, double height, double weight,double economy, int wickets){
		super(name,dob,nation,height,weight);
		this.economy = economy;
		this.wickets = wickets;
	}
	void display() {
		System.out.println("------------Bowler Info-------------");
		super.display();
		System.out.println("Economy:"+economy);
		System.out.println("Wickets:"+wickets);
		System.out.println("-------------------------------");
	}
}
public class Cricket {

	public static void main(String[] args) {
		Bowler b = new Bowler("pathirana","12-07-2000","srilanka",6.7,50,8,15);
		b.display();
		
		Batsman bat = new Batsman("MSD","15-10-1990","india",6.7,55,"RH",100,100);
		bat.display();

	}

}
