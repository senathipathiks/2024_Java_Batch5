package com.subash.HibernateEx5InheritanceMapping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bowler")
//@AttributeOverrides({
//	@AttributeOverride(name = "pid",column = @Column(name="palyerId")),
//	@AttributeOverride(name = "pname",column = @Column(name="palyerName")),
//	@AttributeOverride(name = "pcountry",column = @Column(name="country"))
//})
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