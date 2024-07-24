package com.aravind.InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Player")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CricketPlayer {
	
	@Id
	int playerid;
	
	@Column(name="name")
	String playername;
	
	@Column(name="country")
	String country;
	
	
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CricketPlayer(int playerid, String playername, String country) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.country = country;
	}


	public int getPlayerid() {
		return playerid;
	}


	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}


	public String getPlayername() {
		return playername;
	}


	public void setPlayername(String playername) {
		this.playername = playername;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "CricketPlayer [playerid=" + playerid + ", playername=" + playername + ", country=" + country + "]";
	}
	
	
	
	

}