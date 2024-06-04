package com.gana.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("7284")
	int doorno;
	@Value("mdu")
	String strname;
	@Value("mdu")
	String city;

	
	public String toString() {
		return "Spec [doorno = "+ doorno +", strname = "+ strname +" , city = "+ city +"]";
		
	}


	public void setDoorno(int i) {
		// TODO Auto-generated method stub
		
	}

}
