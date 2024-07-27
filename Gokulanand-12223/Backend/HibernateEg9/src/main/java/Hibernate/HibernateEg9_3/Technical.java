package Hibernate.HibernateEg9_3;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "technical_3")
public class Technical extends Trainer 
{
	String trainername;
	String spec;
	
	public Technical() 
	{
		super();
	}
	
	public Technical(int trainerid, String trainername, String trainerage) 
	{
		super(trainerid, trainername, trainerage);
	}

	public Technical(int trainerid, String trainername, String trainerage, String trainername2, String spec) {
		super(trainerid, trainername, trainerage);
		trainername = trainername2;
		this.spec = spec;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}	
}
