package com.raj.InheritanceMapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

public class Batsman extends CricketPlayer {
	
	int runs;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerid, String playnername, String country) {
		super(playerid, playnername, country);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerid, String playnername, String country, int runs) {
		super(playerid, playnername, country);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
	
	
}
