package com.raj.InheritanceMapping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Batsman1")

public class Batsman extends CricketPlayer {
	
	int runs;

	public Batsman() {
		super();
	}

	public Batsman(int playerid, String playnername, String country) {
		super(playerid, playnername, country);
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
