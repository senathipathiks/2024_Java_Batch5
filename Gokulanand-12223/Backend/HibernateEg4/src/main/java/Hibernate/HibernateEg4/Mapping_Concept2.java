package Hibernate.HibernateEg4;

import javax.persistence.Entity;

@Entity
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
