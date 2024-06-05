package com.hiber.hiber_Joined;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Bowler1")
//@AttributeOverrides({
//	@AttributeOverride(name = "playerid", column = @Column(name = "Player_id")),
//	@AttributeOverride(name = "playername", column = @Column(name = "Player_Name")),
//	@AttributeOverride(name = "country", column = @Column(name = "Country")),
//	@AttributeOverride(name = "age", column = @Column(name = "Age"))
//})
public class Bowler extends CricketPlayer {
	int wickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playername, String country, String age) {
		super(playerid, playername, country, age);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playername, String country, String age, int wickets) {
		super(playerid, playername, country, age);
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
}
