package com.karthi.LaptopEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Specification {
	@Autowired
	HardDisk hd;

	public Specification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specification(HardDisk hd) {
		super();
		this.hd = hd;
	}

	public HardDisk getHd() {
		return hd;
	}

	public void setHd(HardDisk hd) {
		this.hd = hd;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hard Disk Name : "+ hd.name;
	}
}
