package com.gopi.hibernateInheritance2;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Bowler")
//@AttributeOverrides({
//	@AttributeOverride(name="pid",column = @Column(name="playerId")),
//	@AttributeOverride(name="pname",column = @Column(name="playerName")),
//	@AttributeOverride(name="pcountry",column = @Column(name="country"))
//	
//})
public class Bowler extends CricketPlayer {

	int wickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerId, String playerName, String country) {
		super(playerId, playerName, country);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerId, String playerName, String country, int wickets) {
		super(playerId, playerName, country);
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
}
