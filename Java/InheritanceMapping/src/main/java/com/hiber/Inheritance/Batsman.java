package com.hiber.Inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Batsman extends CricketPlayer {
	int runs;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerid, String playername, String country, String age) {
		super(playerid, playername, country, age);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerid, String playername, String country, String age, int runs) {
		super(playerid, playername, country, age);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
}
