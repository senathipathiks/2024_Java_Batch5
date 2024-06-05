package com.hiber.hiber_Inheritance_Table_perclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Player_TablePerClass")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CricketPlayer {
	@Id
	int playerid;
	@Column
	String playername;
	@Column
	String country;
	@Column
	String age;
	
	
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CricketPlayer(int playerid, String playername, String country, String age) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.country = country;
		this.age = age;
	}


	@Override
	public String toString() {
		return "CricketPlayer [playerid=" + playerid + ", playername=" + playername + ", country=" + country + ", age="
				+ age + "]";
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


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}
	
}
