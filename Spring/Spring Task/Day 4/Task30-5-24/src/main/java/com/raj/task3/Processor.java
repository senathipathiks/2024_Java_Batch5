package com.raj.task3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Processor {
	@Value("Intel")
	String brand;
	@Value("x64")
	String arc;
	@Value("2.5 Ghz")
	String clock_speed;
	public Processor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Processor(String brand, String arc, String clock_speed) {
		super();
		this.brand = brand;
		this.arc = arc;
		this.clock_speed = clock_speed;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", arc=" + arc + ", clock_speed=" + clock_speed + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getArc() {
		return arc;
	}
	public void setArc(String arc) {
		this.arc = arc;
	}
	public String getClock_speed() {
		return clock_speed;
	}
	public void setClock_speed(String clock_speed) {
		this.clock_speed = clock_speed;
	}
	
	
}
