package com.supraja.HiberInheritance;

import javax.persistence.Entity;

@Entity
public class Bowler extends CricketPlayer 
{
   int wickets;

public Bowler(int playerid, String playername, String country, int wickets) {
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

public int getWickets() {
	return wickets;
}

public void setWickets(int wickets) {
	this.wickets = wickets;
}
   
   
}