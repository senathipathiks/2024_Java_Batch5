package com.day4.Laptop_Specs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Specs {
	@Autowired
	private Processor processor;
	
	@Autowired
	private Core core;
	
	@Autowired
	private Storage storage;
	
	@Autowired
	private Ram ram;
	
	public Specs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specs(Processor processor, Core core, Storage storage, Ram ram) {
		super();
		this.processor = processor;
		this.core = core;
		this.storage = storage;
		this.ram = ram;
	}

//	@Override
//	public String toString() {
//		return "Specs [processor=" + processor + ", core=" + core + ", storage=" + storage + ", ram=" + ram + "]";
//	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Core getCore() {
		return core;
	}

	public void setCore(Core core) {
		this.core = core;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	public void display(){
		System.out.println("***Laptop Specs***");
		System.out.println();
		System.out.println("Processor:");
		System.out.println("Processor Brand: "+processor.brand);
		System.out.println("Processor Architecture: "+processor.arc);
		System.out.println("Processor Clock Speed: "+processor.clock_speed);
		System.out.println();
		System.out.println("Core:");
		System.out.println("No of Cores: "+core.core);
		System.out.println();
		System.out.println("Storage:");
		System.out.println("Storage Type and Brand: "+storage.ssd);
		System.out.println();
		System.out.println("RAM:");
		System.out.println("RAM Type: "+ram.ram_type);
		System.out.println("RAM Brand: "+ram.ram_brand);
	}
}
