package com.day2;

class CricketPlayer
{
	private String name ;
	private String city;
	private int height ;
	private int weight ;
	
	CricketPlayer(String name,String city,int height,int weight)
	{
		this.name = name;
		this.city = city;
		this.height = height;
		this.weight = weight;
		
}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("city:"+city);
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
	}
}

class Batsman extends CricketPlayer
{
	String type;
	int average;
	int strikerate;
	
	Batsman(String name,String city,int height,int weight,String type,int average,int strikerate)
	{
		super(name,city,height,weight);
		this.type = type;
		this.average = average;
		this.strikerate = strikerate;
	}
	void display() {
		super.display();
		System.out.println("type:"+type);
		System.out.println("average:"+average);
		System.out.println("strikerate:"+strikerate);
		
	}
}


class Bowler extends CricketPlayer
{
	String type;
	int wickets;
	int economy;
	
	Bowler(String name,String city,int height,int weight,String type,int wickets,int economy)
	{
		super(name,city,height,weight);
		this.type = type;
		this.wickets = wickets;
		this.economy = economy;
	}
	void display() {
		super.display();
		System.out.println("type:"+type);
		System.out.println("wickets:"+wickets);
		System.out.println("economy:"+economy);
		
	}
}
public class Cricket {

	public static void main(String[] args) {
		Batsman bat = new Batsman("ms","gg",57,71637,"right",243,13);
		bat.display();
		Bowler bow = new Bowler("gyh","iijk",67,68,"left",79,68);
		bow.display();


	}

}
