package com.subash.HibernateEx5InheritanceMapping;

import javax.persistence.Entity;

@Entity
public class Bowler extends CricketPlayer {
	int wicket;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int palyerId, String palyerName, String country) {
		super(palyerId, palyerName, country);
		// TODO Auto-generated constructor stub
	}

	public Bowler(int palyerId, String palyerName, String country, int wicket) {
		super(palyerId, palyerName, country);
		this.wicket = wicket;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	
	
}
