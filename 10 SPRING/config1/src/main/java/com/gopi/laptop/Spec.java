package com.gopi.laptop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spec {
	
	@Value("Intel(R) Core(TM) i7-10750H CPU @ 2.60GHz   2.59 GHz")
	String processer;
	@Value("16.0 GB")
	String RAM;
	@Value("Windows 11 Pro")
	String Edition;
	
	
	public Spec() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Spec(String processer, String rAM, String edition) {
//		super();
		this.processer = processer;
		RAM = rAM;
		Edition = edition;
	}


	public String getProcesser() {
		return processer;
	}


	public void setProcesser(String processer) {
		this.processer = processer;
	}


	public String getRAM() {
		return RAM;
	}


	public void setRAM(String rAM) {
		RAM = rAM;
	}


	public String getEdition() {
		return Edition;
	}


	public void setEdition(String edition) {
		Edition = edition;
	}


	@Override
	public String toString() {
		return "Spec [processer=" + processer + ", RAM=" + RAM + ", Edition=" + Edition + "]";
	}
	
	
	


	
	
}
