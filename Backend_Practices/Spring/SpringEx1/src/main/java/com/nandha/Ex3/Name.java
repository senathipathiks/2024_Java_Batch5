package com.nandha.Ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Name {
	
	@Value("HP")
	String lName;

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Name(String lName) {
		super();
		this.lName = lName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "" + lName + "";
	}

}
