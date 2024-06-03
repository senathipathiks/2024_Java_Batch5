package com.aravind.TablePerSubclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="Batsman1")
//@AttributeOverrides({
//	@AttributeOverride(name = "pid", column = @Column(name = "playerid")),
//	@AttributeOverride(name = "pname", column = @Column(name= "playername" )),
//	@AttributeOverride(name = "pcountry", column = @Column(name = "country"))
//	
//
//})
public class Batsman extends CricketPlayer {
	
	int runs;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerid, String playername, String country) {
		super(playerid, playername, country);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerid, String playername, String country, int runs) {
		super(playerid, playername, country);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	

	@Override
	public String toString() {
		return "Batsman [runs=" + runs + "]";
	}
	
	

}
