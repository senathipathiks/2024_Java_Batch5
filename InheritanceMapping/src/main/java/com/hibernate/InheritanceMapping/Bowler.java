package com.hibernate.InheritanceMapping;

import javax.persistence.Entity;

@Entity
public class Bowler extends CricketPlayer {

	
	int wickets;
	
	
	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerId, String playername, String country) {
		super(playerId, playername, country);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerId, String playername, String country, int wickets) {
		super(playerId, playername, country);
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	
	
	
}
