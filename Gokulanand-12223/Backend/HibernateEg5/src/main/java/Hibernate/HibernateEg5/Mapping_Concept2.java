package Hibernate.HibernateEg5;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Bowler")
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
public class Mapping_Concept2 extends Mapping 
{
	int overs;

	public Mapping_Concept2() 
	{
		super();
	}

	public Mapping_Concept2(int playerid, String playername, String playercity) 
	{
		super(playerid, playername, playercity);
	}

	public Mapping_Concept2(int playerid, String playername, String playercity, int overs) {
		super(playerid, playername, playercity);
		this.overs = overs;
	}

	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}	
}
