package day3;


import java.util.Scanner;

class Player{
	 private String Name;
	 private String nationality;
	 private String IPLTeam;
	 private String Type;
	 private int Age;
	
	
	  
    Player(){
   	 System.out.println("Player Info ");
   	 System.out.println("--------------------------------------");
    }

	
	public Player(String Name, String nationality, String IPLTeam,String Type ,int Age) {
		 System.out.println("Player Info ");
   	 System.out.println("------------------------------------------------");
		this.Name=Name;
		this.nationality = nationality;
		this.IPLTeam=IPLTeam;
		this.Age=Age;
		this.Type=Type;
		print();
	}
	void print() {
		System.out.println("Player Name :"+Name);
		System.out.println("Nationality : "+nationality);
		System.out.println("Teams Played :"+IPLTeam);
		System.out.println("Age :"+Age);
		System.out.println("Type :"+Type);
	}
	


}

class Batsman extends Player{
	private int NoOFinnings;
	private int runs;
	private int avg;
	private double sr;
	private int highscore;
	private int NoOfHalfCenturies;
	private int NoOfCenturies;
	
	Batsman(String Name,String nationality,String IPLTeam,String Type,int Age,int NoOFinnings , int runs , int avg ,double sr, int highscore , int NoOfHalfCenturies , int NoOfCenturies)
	{   
		super(Name,nationality,IPLTeam,Type,Age);
		this.NoOFinnings = NoOFinnings;
		this.runs=runs;
		this.avg=avg;
		this.sr=sr;
		this.highscore=highscore;
		this.NoOfHalfCenturies=NoOfHalfCenturies;
		this.NoOfCenturies=NoOfCenturies;
	}
   void display() {
   	
   	System.out.println("Total Runs : "+runs);
   	System.out.println("Average    : "+avg);
   	System.out.println("Strike Rate: "+sr);
   	System.out.println("High Score : "+highscore);
   	System.out.println("Number of 50s :"+NoOfHalfCenturies);
   	System.out.println("Number of 100s:" +NoOfCenturies);
   	System.out.println("-------------------------------------------------");
   }
}
class Bowler extends Player{
	private int wickets;
	private int NoOfMatches ;
	private double economy;
	private String best;
	
	Bowler(String Name,String nationality,String IPLTeam,String Type,int Age,int wickets , int NoOFMatches ,double economy, String best)
	{  
		super(Name,nationality,IPLTeam,Type,Age);
		this.wickets=wickets;
		this.NoOfMatches=NoOFMatches;
		this.economy=economy;
		this.best=best;	
	}
   void display() {
   	System.out.println("Total Wickets: "+wickets);
   	System.out.println("Matches Played    : "+NoOfMatches);
   	System.out.println("Econmy Rate: "+economy);
   	System.out.println("Best Figures: "+best);
   	System.out.println("--------------------------------------------------");
   }
	
}
public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select Player Type 1.Batman 2.Bowler");
		int ch= s.nextInt();
		String Name ="";
		String IPLTeam = null;
		String nationality = null;
		 String Type = null;
		 int Age = 0;
		 int NoOFinnings = 0;
		 int runs = 0;
		 int avg = 0;
		 double sr = 0;
		 int highscore = 0;
		 int NoOfHalfCenturies = 0;
		 int NoOfCenturies = 0;
		switch (ch) {
		case 1: {
			System.out.println("Enter Players Name:\n");
			Name  = s.next();
			System.out.println("Enter Players Team");
			 IPLTeam =s.next();
			 System.out.println("Enter Players NAtion");
			 nationality =s.next();
			 System.out.println("Enter Player Type");
			 Type = s.next();
			 System.out.println("Enter Player's Age");
			 Age =s.nextInt();
			 System.out.println("Enter No of Innings");
			 NoOFinnings = s.nextInt();
			 System.out.println("Enter Runs");
			 runs =s.nextInt();
			 System.out.println("Enter Players Average");
		    avg=s.nextInt();
		    System.out.println("Enter Strike Rate");
	         sr =s.nextDouble();
	         System.out.println("Enter Players Highest Score");
		     highscore =s.nextInt();
		     System.out.println("Enter NO of 50s");
			 NoOfHalfCenturies =s.nextInt();
			 System.out.println("Enter No of 100s");
			  NoOfCenturies =s.nextInt();
			
			break;
		}
		case 2:{
			System.out.println("Enter Players Name:\n");
			Name  = s.next();
			System.out.println("Enter Players Team");
			 IPLTeam =s.next();
			 System.out.println("Enter Players NAtion");
			 nationality =s.next();
			 System.out.println("Enter Player Nation");
			 Type = s.next();
			 System.out.println("Enter Player's Age");
			 Age =s.nextInt();
			
			break;
		}
		
		}
       // Batsman b1 =new Batsman("Virat", "India", "RCB", "RightHandedBatsman", 32, 82, 102034, 48, 142.21, 183, 200, 76);
       Batsman b1 = new Batsman(Name, nationality,IPLTeam ,Type , Age, NoOFinnings,runs, avg, sr, highscore, NoOfHalfCenturies, NoOfCenturies);
		b1.display();
        Bowler b2 = new Bowler("Bumrah", "India", "MI", "RightArmFast", 28, 1000, 470, 6.78, "5/23");
        b2.display();
	}

}
