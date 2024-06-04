package com.prabha.hiberInheritance_table_per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Player1")
@Inheritance(strategy = InheritanceType. )

public class CricketPlayer1 {
	
	@Id
	int PlayerId;
	@Column(name="name")
	String PlayerName;
	@Column(name="Country")
	String country;
	public int getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "CricketPlayer [PlayerId=" + PlayerId + ", PlayerName=" + PlayerName + ", country=" + country + "]";
	}
	public CricketPlayer1(int playerId, String playerName, String country) {
		super();
		PlayerId = playerId;
		PlayerName = playerName;
		this.country = country;
	}
	public CricketPlayer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
