package Hibernate.HibernateEg9;

import javax.persistence.Entity;

@Entity
public class Behaviour extends Trainer 
{
	String trainername;
	String spec;
	
	public Behaviour() 
	{
		super();
	}
	
	public Behaviour(int trainerid, String trainername, String trainerage) 
	{
		super(trainerid, trainername, trainerage);
	}

	public Behaviour(int trainerid, String trainername, String trainerage, String trainername2, String spec) {
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
