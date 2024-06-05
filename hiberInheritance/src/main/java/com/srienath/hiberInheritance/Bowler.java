package com.srienath.hiberInheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bowler")
@AttributeOverrides({
	@AttributeOverride(name= "Id",column =@Column(name="playerid")),
	@AttributeOverride(name= "PlayerName",column =@Column(name="name")),
	@AttributeOverride(name= "country",column =@Column(name="country"))
	
})
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
