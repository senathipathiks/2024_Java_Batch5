package com.aravind.InheritanceMapTraineer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dotnet1")
public class Dotnet extends Technical {
	String spec;

	public Dotnet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int tid, String tname, String city, String qual, String desg) {
		super(tid, tname, city, qual, desg);
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int tid, String tname, String city) {
		super(tid, tname, city);
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int tid, String tname, String city, String qual, String desg, String spec) {
		super(tid, tname, city, qual, desg);
		this.spec = spec;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "Dotnet [spec=" + spec + "]";
	}
	
	

}
