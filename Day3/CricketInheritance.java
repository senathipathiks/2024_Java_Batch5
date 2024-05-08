package Day3;

class Cricketplayer 
{
	String cname,nationality;
	int age,height,weight;
	Cricketplayer()
	{
		System.out.println("Cricket Player");
	}
	Cricketplayer(String cname,int age,String nationality,int height,int weight)
	{
		this.cname=cname;
		this.nationality=nationality;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	void display1() {
		System.out.println(cname + "," + age + "," + nationality + "," + height + "," + weight);
	}
}

class Batsman extends Cricketplayer
{
	String battype;
	int highscore,totalruns,hundreds,fifties;
	double strikerate;
	Batsman()
	{
		System.out.println("Batsman");
	}
	Batsman(String battype,double strikerate,int highscore,int totalruns,int hundreds,int fifties)
	{
		super("Suresh Raina",38,"India",183,76);
		this.battype=battype;
		this.highscore=highscore;
		this.totalruns=totalruns;
		this.hundreds=hundreds;
		this.fifties=fifties;
	}
	void display2() {
		System.out.println(battype + "," + strikerate + "," + highscore + "," + totalruns + "," + hundreds + "," + fifties);
	}
}

class Bowler extends Cricketplayer
{
	String bowltype;
	double economy;
	int highwicket,totalwickets;
	Bowler()
	{
		System.out.println("Bowler");
	}
	Bowler(String bowltype , double economy,int highwicket, int totalwickets)
	{
		super("Sunil Narine",39,"West Indies",187,81);
		this.bowltype=bowltype;
		this.economy=economy;
		this.highwicket=highwicket;
		this.totalwickets=totalwickets;
		
	}
	void display3() {
		System.out.println(bowltype + "," + economy + "," + highwicket + "," + totalwickets);
	}
}

public class CricketInheritance {

	public static void main(String[] args) {
//		Bowler obj1 = new Bowler();
		Bowler obj1 = new Bowler("Spinner",8.7,6,103);
		obj1.display1();
		obj1.display3();
		Batsman obj2 = new Batsman("LeftHand",188.9,147,12456,40,110);
		obj2.display1();
		obj2.display2();
	}

}
