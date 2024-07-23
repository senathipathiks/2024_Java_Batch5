package com.hiber.Inheritance;

import javax.persistence.Entity;

@Entity
public class Bowler extends CricketPlayer {
	int wickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playername, String country, String age) {
		super(playerid, playername, country, age);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playername, String country, String age, int wickets) {
		super(playerid, playername, country, age);
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
}
