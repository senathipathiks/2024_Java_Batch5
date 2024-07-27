package Hibernate.HibernateEg9_3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import Hibernate.HibernateEg9.*;

@Entity
@Table(name = "trainer_tbl_3")
@Inheritance(strategy=InheritanceType.JOINED)
public class Trainer 
{
	@Id
	int trainerid;
	@Column
	String trainername;
	@Column
	String trainerage;
	
	public Trainer() 
	{
		super();
	}

	public Trainer(int trainerid, String trainername, String trainerage) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
		this.trainerage = trainerage;
	}

	public int getTrainerid() {
		return trainerid;
	}

	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	public String getTrainerage() {
		return trainerage;
	}

	public void setTrainerage(String trainerage) {
		this.trainerage = trainerage;
	}

	@Override
	public String toString() {
		return "Trainer [trainerid=" + trainerid + ", trainername=" + trainername + ", trainerage=" + trainerage + "]";
	}
}
