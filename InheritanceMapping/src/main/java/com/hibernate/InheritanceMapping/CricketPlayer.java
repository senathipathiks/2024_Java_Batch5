package com.hibernate.InheritanceMapping;

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
	int playerId;
	@Column(name = "PLayerName")
	String playername;
	@Column(name="Country")
	String country ;
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CricketPlayer(int playerId, String playername, String country) {
		super();
		this.playerId = playerId;
		this.playername = playername;
		this.country = country;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
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
	
	
	
	
	
}
