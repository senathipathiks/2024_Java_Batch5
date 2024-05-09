package Inheritance;
class CricketPlayer{
	String cname;
	int age;
	String Nationality;
	int height;
	int weight;
	
	CricketPlayer(){
		System.out.println("IPL");
	}
	CricketPlayer(String cname,int age,String Nationality,int height,int weight){
		//System.out.println(cname+","+age+","+Nationality+","+height+","+weight);
	}
	void display1(){
		System.out.println(cname+","+age+","+Nationality+","+height+","+weight);
	}
}
class Batsman extends CricketPlayer {
	String batType;
	float strikeRate;
	int highScore;
	int totalRuns;
	Batsman(){
		System.out.println("Batsman");
	}
	Batsman(String batType,float strikeRate,int highScore,int totalRuns){
		this.batType=batType;
		this.strikeRate=strikeRate;
		this.highScore=highScore;
		this.totalRuns=totalRuns;
		//System.out.println(batType+","+strikeRate+","+highScore+","+totalRuns);
		
	}
	void display2() {
		
		System.out.println(batType+","+strikeRate+","+highScore+","+totalRuns);
	}
}
class Bowler extends CricketPlayer {
	String bowlType;
	float economy;
	int totalWickets;
	Bowler(){
		System.out.println("Bowler");
	}
	Bowler(String bowlType,float  economy,int totalWickets){
		this.bowlType=bowlType;
		this.economy=economy;
		this.totalWickets=totalWickets;
	//	System.out.println(bowlType+","+economy+","+totalWickets);
		
	}
	void display3() {
		System.out.println(bowlType+","+economy+","+totalWickets);
	}
}
public class Cricket {
	public static void main(String[] args) {
		
	}

}
