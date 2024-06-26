package com.gopi.hibernateInheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Batsman extends CricketPlayer {
	
	int runs;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country) {
		super(playerId, playerName, country);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country, int runs) {
		super(playerId, playerName, country);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
	
}
