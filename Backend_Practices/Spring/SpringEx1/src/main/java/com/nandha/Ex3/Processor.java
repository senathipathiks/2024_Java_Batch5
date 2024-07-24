package com.nandha.Ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Processor {
	
	@Value("Ryzen 7")
	String lProcessor;

	public Processor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Processor(String lProcessor) {
		super();
		this.lProcessor = lProcessor;
	}

	public String getlProcessor() {
		return lProcessor;
	}

	public void setlProcessor(String lProcessor) {
		this.lProcessor = lProcessor;
	}

	@Override
	public String toString() {
		return "" + lProcessor + "";
	}
	
	

}
