package Hibernate.HibernateEg6;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Batsman1")
/*
 * @AttributeOverrides({
 * 
 * @AttributeOverride(name = "playerid", column = @Column(name = "Player_Id")),
 * 
 * @AttributeOverride(name = "playername", column = @Column(name =
 * "Player_Name")),
 * 
 * @AttributeOverride(name = "playercity", column = @Column(name =
 * "Player_City")) })
 */

public class Mapping_Concept extends Mapping 
{

	int runs;

	public Mapping_Concept() 
	{
		super();
	}

	public Mapping_Concept(int playerid, String playername, String playercity) 
	{
		super(playerid, playername, playercity);
	}

	public Mapping_Concept(int playerid, String playername, String playercity, int runs) 
	{
		super(playerid, playername, playercity);
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}	
}
