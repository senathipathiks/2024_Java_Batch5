package com.hiber.hiber_Joined;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Batsman2")
//@AttributeOverrides({
//	@AttributeOverride(name = "playerid", column = @Column(name = "Player_id")),
//	@AttributeOverride(name = "playername", column = @Column(name = "Player_Name")),
//	@AttributeOverride(name = "country", column = @Column(name = "Country")),
//	@AttributeOverride(name = "age", column = @Column(name = "Age"))
//})
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
