package com.hibernate.InheritanceMapping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Batsman")
//@AttributeOverrides({
//	@AttributeOverride(name = "pid" ,column= @Column(name="playerId")),
//	@AttributeOverride(name = "pname", column = @Column(name="playername")),
//	@AttributeOverride(name = "pname", column = @Column(name="country"))
//	
//	
//	
//	
//})
public class Batsman extends CricketPlayer {

	int runs;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playername, String country) {
		super(playerId, playername, country);
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playername, String country, int runs) {
		super(playerId, playername, country);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
	
}
