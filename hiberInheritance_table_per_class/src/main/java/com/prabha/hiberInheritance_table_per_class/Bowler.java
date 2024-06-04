package com.prabha.hiberInheritance_table_per_class;

import javax.persistence.Entity;

@Entity
public class Bowler extends CricketPlayer {
	
	int wickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerId, String playerName, String country) {
		super(playerId, playerName, country);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerId, String playerName, String country, int wickets) {
		super(playerId, playerName, country);
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	

}
