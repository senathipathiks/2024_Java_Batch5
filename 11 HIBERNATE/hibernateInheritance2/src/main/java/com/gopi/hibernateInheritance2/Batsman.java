package com.gopi.hibernateInheritance2;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Batsman")
//@AttributeOverrides({
//	@AttributeOverride(name="pid",column = @Column(name="playerId")),
//	@AttributeOverride(name="pname",column = @Column(name="playerName")),
//	@AttributeOverride(name="pcountry",column = @Column(name="country"))
//	
//})
public class Batsman extends CricketPlayer {
	
	int runs;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country) {
		super(playerId, playerName, country);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country, int runs) {
		super(playerId, playerName, country);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
	
}
