package com.srienath.hiberInheritance;

import javax.persistence.Entity;

@Entity
public class Batsman extends CricketPlayer {
	int runs;

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public Batsman(int playerid, String playername, String country,int runs) {
		super(playerid,playername,country);
		this.runs = runs;
	}

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerid, String playername, String country) {
		super(playerid, playername, country);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Batsman [runs=" + runs + ", playerid=" + playerid + ", playername=" + playername + ", country="
				+ country + "]";
	}

	
	
	
}
