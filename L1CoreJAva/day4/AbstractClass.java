package com.day4;

//abstract class ServiceStation{
//	String city;
//	ServiceStation(){
//		
//	}
//	ServiceStation(String s){
//		city=s;
//	}
//	abstract void service();
//}
//
//class TwoWheelerStation extends ServiceStation{
//	TwoWheelerStation(){
//	}
//	TwoWheelerStation(String s)
//	{
//		super(s);
//	}
//	void service() {
//		System.out.println("Two Wheeler Station");
//	}
//}
//
//class FourWheelerStation extends ServiceStation{
//	FourWheelerStation(){
//	}
//	FourWheelerStation(String s)
//	{
//		super(s);
//	}
//	void service() {
//		System.out.println("Four Wheeler Station");
//	}
//}
abstract class CricketPlayer{
	String name;
	String nation;
	int age;
	CricketPlayer(String Pname, String Pnation, int Page){
		name=Pname;
		nation=Pnation;
		age=Page;
	}
	abstract void display();
}
class Batsman extends CricketPlayer{
	int runs;
	Batsman(String name,String nation,int age,int Pruns){
		super(name,nation,age);
		runs=Pruns;
	}
	void display() {
		System.out.println("Batsman Name: "+name);
		System.out.println("Batsman Nation: "+nation);
		System.out.println("Batsman Age: "+age);
		System.out.println("Batsman Runs: "+runs);
	}
}
class Bowler extends CricketPlayer{
	int wickets;
	Bowler(String name,String nation,int age,int Pwickets){
		super(name,nation,age);
		wickets=Pwickets;
	}
	void display() {
		System.out.println("Bowler Name: "+name);
		System.out.println("Bowler Nation: "+nation);
		System.out.println("Bowler Age: "+age);
		System.out.println("Bowler Wickets: "+wickets);
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ServiceStation s;
//		s=new TwoWheelerStation("Coimbatore");
//		s.service();
//		s=new FourWheelerStation("Theni");
//		s.service();
		CricketPlayer c;
		c=new Batsman("Vicky","India",22,4500);
		c.display();
		System.out.println("---------------------------------------");
		c=new Bowler("Bumrah","India",25,123);
		c.display();
	}

}
