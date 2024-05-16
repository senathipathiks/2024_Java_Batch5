package com.day4;

abstract class Cricket{
	String name,style;
	Cricket(String name, String style){
		this.name = name;
		this.style = style;		
	}
	abstract void display();
}

class Bat extends Cricket{
	Bat(String name,String style){
		super(name,style);
	}
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Batting = "+style);
	}
}
class Bowling extends Cricket{
	Bowling(String name,String style){
		super(name,style);
	}
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Bowling = "+style);
	}
}
public class Abstract_cricket {

	public static void main(String[] args) {
		Cricket c;
		c = new Bat("MSD","RH");
		c.display();
		c = new Bowling("Pathirana","Spinner");
		c.display();

	}

}
