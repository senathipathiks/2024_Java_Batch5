package com.raj.InheritanceMapping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Batsman")
//
//@AttributeOverrides({
//	
//@AttributeOverride(name = "pid", column = @Column(name="playerid")),
//@AttributeOverride(name = "pname", column = @Column(name="playername")),
//@AttributeOverride(name = "pcountry", column = @Column(name="country"))
//	
//})

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
