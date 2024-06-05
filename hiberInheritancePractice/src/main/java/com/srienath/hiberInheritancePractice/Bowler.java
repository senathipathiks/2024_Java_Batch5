package com.srienath.hiberInheritancePractice;

import javax.persistence.Entity;

@Entity
public class Bowler extends CricketPlayer {
	int wickets;

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public Bowler(int playerid, String playername, String country,int wickets) {
		super(playerid, playername, country);
		this.wickets = wickets;
	}

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playername, String country) {
		super(playerid, playername, country);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bowler [wickets=" + wickets + ", playerid=" + playerid + ", playername=" + playername + ", country="
				+ country + "]";
	}

	
	
}
