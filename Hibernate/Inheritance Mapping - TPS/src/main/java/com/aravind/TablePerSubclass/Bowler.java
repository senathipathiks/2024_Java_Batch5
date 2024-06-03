package com.aravind.TablePerSubclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bowler1")
//@AttributeOverrides({
//	@AttributeOverride(name = "pid", column = @Column(name = "playerid")),
//	@AttributeOverride(name = "pname", column = @Column(name= "playername" )),
//	@AttributeOverride(name = "pcountry", column = @Column(name = "country"))
//	
//
//})
public class Bowler extends CricketPlayer {
	
	int wickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playername, String country) {
		super(playerid, playername, country);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerid, String playername, String country, int wickets) {
		super(playerid, playername, country);
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Bowler [wickets=" + wickets + "]";
	}
	
	

}
