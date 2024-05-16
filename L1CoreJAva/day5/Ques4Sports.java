package com.day5;

interface Playable{
	void play();
}

class Football implements Playable{
	public void play() {
		System.out.println("Play Football");
	}
}

class VolleyBall implements Playable{
	public void play() {
		System.out.println("Play Volleyball");
	}
}

class BasketBall implements Playable{
	public void play() {
		System.out.println("Play BasketBall");
	}
}

public class Ques4Sports {
	public static void main(String args[]) {
		
	Playable p;
	p=new Football();
	p.play();
	p=new VolleyBall();
	p.play();
	p=new BasketBall();
	p.play();
	
	}
}
