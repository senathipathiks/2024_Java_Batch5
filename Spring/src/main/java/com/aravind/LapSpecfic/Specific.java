package com.aravind.LapSpecfic;

public class Specific {
	String processor, harddrivers, graphicscard;

	public Specific() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specific(String processor, String harddrivers, String graphicscard) {
		super();
		this.processor = processor;
		this.harddrivers = harddrivers;
		this.graphicscard = graphicscard;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getHarddrivers() {
		return harddrivers;
	}

	public void setHarddrivers(String harddrivers) {
		this.harddrivers = harddrivers;
	}

	public String getGraphicscard() {
		return graphicscard;
	}

	public void setGraphicscard(String graphicscard) {
		this.graphicscard = graphicscard;
	}

	@Override
	public String toString() {
		return "Specific [processor=" + processor + ", harddrivers=" + harddrivers + ", graphicscard=" + graphicscard
				+ "]";
	}
	
	

}
