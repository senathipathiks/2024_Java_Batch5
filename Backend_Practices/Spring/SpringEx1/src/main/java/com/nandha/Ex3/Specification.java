package com.nandha.Ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Specification {
	
	@Autowired
	Name lName;
	
	@Autowired
	Model lModel;
	
	@Autowired
	HardDisk lHD;
	
	@Autowired
	Processor lPro;
	
	@Autowired
	RAM lram;

	public Specification() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public HardDisk getlHD() {
		return lHD;
	}

	public void setlHD(HardDisk lHD) {
		this.lHD = lHD;
	}

	public Processor getlPro() {
		return lPro;
	}

	public void setlPro(Processor lPro) {
		this.lPro = lPro;
	}

	public RAM getLram() {
		return lram;
	}

	public void setLram(RAM lram) {
		this.lram = lram;
	}
	
	

	public Name getlName() {
		return lName;
	}



	public void setlName(Name lName) {
		this.lName = lName;
	}



	public Model getlModel() {
		return lModel;
	}



	public void setlModel(Model lModel) {
		this.lModel = lModel;
	}



	public Specification(Name lName, Model lModel, HardDisk lHD, Processor lPro, RAM lram) {
		super();
		this.lName = lName;
		this.lModel = lModel;
		this.lHD = lHD;
		this.lPro = lPro;
		this.lram = lram;
	}



	
	

}
