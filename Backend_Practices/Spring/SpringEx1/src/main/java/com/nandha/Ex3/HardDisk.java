package com.nandha.Ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.spel.ast.IntLiteral;
import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	
	@Value("1GB")
	String lHardDisk;

	public HardDisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HardDisk(String lHardDisk) {
		super();
		this.lHardDisk = lHardDisk;
	}

	public String getlHardDisk() {
		return lHardDisk;
	}

	public void setlHardDisk(String lHardDisk) {
		this.lHardDisk = lHardDisk;
	}

	@Override
	public String toString() {
		return "" + lHardDisk + "";
	}
	
	

}
