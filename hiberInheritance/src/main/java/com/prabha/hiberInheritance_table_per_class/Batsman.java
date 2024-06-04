package com.prabha.hiberInheritance_table_per_class;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Batsman1")
@AttributeOverrides({
	@AttributeOverride(name="PlayerId",column= @Column(name="PlayerId")),
	@AttributeOverride(name="PlayerName",column= @Column(name="PlayerName")),
	@AttributeOverride(name="country",column= @Column(name="country"))	
})

public class Batsman extends CricketPlayer {
	
	int runScore;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country) {
		super(playerId, playerName, country);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, String country, int runScore) {
		super(playerId, playerName, country);
		this.runScore = runScore;
	}

	public int getRunScore() {
		return runScore;
	}

	public void setRunScore(int runScore) {
		this.runScore = runScore;
	}
	

}
