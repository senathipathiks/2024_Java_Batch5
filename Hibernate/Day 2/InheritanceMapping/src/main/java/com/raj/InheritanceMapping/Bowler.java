package com.raj.InheritanceMapping;

import javax.persistence.Entity;

@Entity
public class Bowler extends CricketPlayer {
	
	int wickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playnername, String country) {
		super(playerid, playnername, country);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playnername, String country, int wickets) {
		super(playerid, playnername, country);
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
}
