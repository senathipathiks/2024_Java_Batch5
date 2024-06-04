package com.prabha.hiberInheritance;

import javax.persistence.Entity;

@Entity

public class Batsman extends CricketPlayer {
	
	int runScore;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country) {
		super(playerId, playerName, country);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country, int runScore) {
		super(playerId, playerName, country);
		this.runScore = runScore;
	}

	public int getRunScore() {
		return runScore;
	}

	public void setRunScore(int runScore) {
		this.runScore = runScore;
	}
	

}
