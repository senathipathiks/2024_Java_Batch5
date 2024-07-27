package Hibernate.HibernateEg4;

import javax.persistence.Entity;

@Entity
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
