package com.gopi.hibernateInheritance2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Player2Class")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CricketPlayer {
	
	@Id
	int playerId;
	@Column
	String playerName;
	@Column
	String Country;
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CricketPlayer(int playerId, String playerName, String country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		Country = country;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
	
	
}
