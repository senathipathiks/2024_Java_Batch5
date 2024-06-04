package com.gana.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spec {
	
	@Value("12")
	int ram;
	@Value("intel i7")
	String processor;
	@Value("metallic grey")
	String color;

	
	public String toString() {
		return "Spec [ram = "+ ram +", processor = "+ processor +" , color = "+ color +"]";
		
	}


	public void setRam(int i) {
		// TODO Auto-generated method stub
		
	}

}
