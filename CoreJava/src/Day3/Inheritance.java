package Day3;

class CircketPlayer{
	String name;
	int age;
	String nationality;
	float weigth;
	float height;
	public CircketPlayer(String name, int age, String nationality, float weigth, float height) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.weigth = weigth;
		this.height = height;
	}
}

class Batsman extends CircketPlayer{
	int average;
	int strikerate;
	String batingStyle;
	int highScore;
	int runs;
	public Batsman(String name, int age, String nationality, float weigth, float height, int average, int strikerate,
			String batingStyle, int highScore, int runs) {
		super(name, age, nationality, weigth, height);
		this.average = average;
		this.strikerate = strikerate;
		this.batingStyle = batingStyle;
		this.highScore = highScore;
		this.runs = runs;
	}
	
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Nationality :"+nationality);
		System.out.println("Weight :"+weigth);
		System.out.println("Height :"+height);
		System.out.println("Average :"+average);
		System.out.println("Strike-Rate :"+strikerate);
		System.out.println("Bating-Style :"+batingStyle);
		System.out.println("Highscore :"+highScore);
        System.out.println("Runs :"+runs);
		
	}
	
}	

class Bowlers extends CircketPlayer{
	float economy;
	int wickets;
	int fivewickethaul;
	String bowlingStyle;
	public Bowlers(String name, int age, String nationality, float weigth, float height, float economy, int wickets,
			int fivewickethaul, String blowingStyle) {
		super(name, age, nationality, weigth, height);
		this.economy = economy;
		this.wickets = wickets;
		this.fivewickethaul = fivewickethaul;
		this.bowlingStyle = blowingStyle;
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Nationality :"+nationality);
		System.out.println("Weight :"+weigth);
		System.out.println("Height :"+height);
		System.out.println("Economy :"+economy);
		System.out.println("Wickets :"+wickets);
		System.out.println("Five-Wicket-Haul :"+fivewickethaul);
		System.out.println("Bowling-Style :"+bowlingStyle);
		
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
	System.out.println("Batsman \n------------");
	Batsman bm=new Batsman("Virat", 34, "Indian", 95, 5.6f,65,145,"Right-Hand-Batsman",124,7546);
	bm.display();
	System.out.println("\nBowler \n------------");
	Bowlers bow=new Bowlers("Bumra", 34, "Indian", 97, 5.9f,6.1f,200,5,"Right-arm-fast");
	bow.display();

	}

}
