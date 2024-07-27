package Hibernate.HibernateEg4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="Player")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Mapping 
{
	@Id
	int playerid;
	@Column(name = "name")
	String playername;
	@Column(name = "country")
	String playercity;
	
	public Mapping() 
	{
		super();
	}

	public Mapping(int playerid, String playername, String playercity) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.playercity = playercity;
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

	public String getPlayercity() {
		return playercity;
	}

	public void setPlayercity(String playercity) {
		this.playercity = playercity;
	}

	@Override
	public String toString() {
		return "Mapping [playerid=" + playerid + ", playername=" + playername + ", playercity=" + playercity + "]";
	}
	
	
	
	
}
