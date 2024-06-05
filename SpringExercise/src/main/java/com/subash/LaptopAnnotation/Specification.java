package com.subash.LaptopAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Specification {
	@Value("2")
	int noOfRam;
	@Value("AMD")
	String processorName;
	@Value("NVidia")
	String GraphicsCardName;
	@Value("OLED")
	String DisplayType;
	@Value("1080p")
	String camera;
	public Specification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specification(int noOfRam, String processorName, String graphicsCardName, String displayType,
			String camera) {
		super();
		this.noOfRam = noOfRam;
		this.processorName = processorName;
		GraphicsCardName = graphicsCardName;
		DisplayType = displayType;
		this.camera = camera;
	}
	public int getNoOfRam() {
		return noOfRam;
	}
	public void setNoOfRam(int noOfRam) {
		this.noOfRam = noOfRam;
	}
	public String getProcessorName() {
		return processorName;
	}
	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}
	public String getGraphicsCardName() {
		return GraphicsCardName;
	}
	public void setGraphicsCardName(String graphicsCardName) {
		GraphicsCardName = graphicsCardName;
	}
	public String getDisplayType() {
		return DisplayType;
	}
	public void setDisplayType(String displayType) {
		DisplayType = displayType;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	@Override
	public String toString() {
		return "specification [noOfRam=" + noOfRam + ", processorName=" + processorName + ", GraphicsCardName="
				+ GraphicsCardName + ", DisplayType=" + DisplayType + ", camera=" + camera + "]";
	}
	
}
