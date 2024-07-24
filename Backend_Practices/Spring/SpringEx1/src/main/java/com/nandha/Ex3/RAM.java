package com.nandha.Ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RAM {
	
	@Value("512")
	int lRam;

	public RAM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RAM(int lRam) {
		super();
		this.lRam = lRam;
	}

	public int getlRam() {
		return lRam;
	}

	public void setlRam(int lRam) {
		this.lRam = lRam;
	}

	@Override
	public String toString() {
		return "" + lRam + "";
	}

}
