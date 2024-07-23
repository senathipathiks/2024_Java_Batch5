package com.day4.Laptop_Specs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Core {
	@Value("8")
	String core;

	public Core() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Core(String core) {
		super();
		this.core = core;
	}

	@Override
	public String toString() {
		return "Core [core=" + core + "]";
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}
	
	
}
