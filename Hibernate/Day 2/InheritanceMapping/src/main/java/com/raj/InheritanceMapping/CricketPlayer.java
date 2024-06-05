package com.raj.InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="player")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CricketPlayer {

	@Id
	int playerid;
	@Column(name="name")
	String playnername;
	@Column(name="country")
	String country;
	public CricketPlayer() {
		super();
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlaynername() {
		return playnername;
	}
	public void setPlaynername(String playnername) {
		this.playnername = playnername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CricketPlayer(int playerid, String playnername, String country) {
		super();
		this.playerid = playerid;
		this.playnername = playnername;
		this.country = country;
	}
	
	
}
