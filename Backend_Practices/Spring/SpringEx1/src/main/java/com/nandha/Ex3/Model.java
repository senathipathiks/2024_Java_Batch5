package com.nandha.Ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Model {
	
	@Value("Z Book")
	String lModelName;

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Model(String lModelName) {
		super();
		this.lModelName = lModelName;
	}

	public String getlModelName() {
		return lModelName;
	}

	public void setlModelName(String lModelName) {
		this.lModelName = lModelName;
	}

	@Override
	public String toString() {
		return "" + lModelName + "";
	}

	
}
