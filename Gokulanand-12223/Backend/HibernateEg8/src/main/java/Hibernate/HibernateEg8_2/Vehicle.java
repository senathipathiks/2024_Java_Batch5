package Hibernate.HibernateEg8_2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_tbl_2")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vehicle 
{
	@Id
	int vehicleid;
	@Column(name = "Owner_Name")
	String ownername;
	@Column(name = "RTO")
	String rto;
	
	public Vehicle() 
	{
		super();
	}

	public Vehicle(int vehicleid, String ownername, String rto) {
		super();
		this.vehicleid = vehicleid;
		this.ownername = ownername;
		this.rto = rto;
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getRto() {
		return rto;
	}

	public void setRto(String rto) {
		this.rto = rto;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", ownername=" + ownername + ", rto=" + rto + "]";
	}	
}
