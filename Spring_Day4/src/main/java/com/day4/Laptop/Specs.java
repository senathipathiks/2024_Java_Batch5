package com.day4.Laptop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Specs {
	@Value("LPDDR5")
	String ram_type;
	@Value("SSD")
	String storage_type;
	@Value("8")
	String cores;
	@Value("3.2Mhz")
	String Clock_Speed;
	
	public Specs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specs(String ram_type, String storage_type, String cores, String clock_Speed) {
		super();
		this.ram_type = ram_type;
		this.storage_type = storage_type;
		this.cores = cores;
		Clock_Speed = clock_Speed;
	}

	@Override
	public String toString() {
		return "Specs [ram_type=" + ram_type + ", storage_type=" + storage_type + ", cores=" + cores + ", Clock_Speed="
				+ Clock_Speed + "]";
	}

	public String getRam_type() {
		return ram_type;
	}

	public void setRam_type(String ram_type) {
		this.ram_type = ram_type;
	}

	public String getStorage_type() {
		return storage_type;
	}

	public void setStorage_type(String storage_type) {
		this.storage_type = storage_type;
	}

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	public String getClock_Speed() {
		return Clock_Speed;
	}

	public void setClock_Speed(String clock_Speed) {
		Clock_Speed = clock_Speed;
	}
	
	
	
}
