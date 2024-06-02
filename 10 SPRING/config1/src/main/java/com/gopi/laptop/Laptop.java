package com.gopi.laptop;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.gopi.laptop.*;

@Component
public class Laptop {
	@Value("A3A78AB6-4B0B-4674-B45C-D6B82F051920")
	String id;
	@Value("RLP1436")
	String name;


	@Autowired
	private Spec spec;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String id, String name) {
		//super();
		this.id = id;
		this.name = name;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Spec getSpec() {
		return spec;
	}
	
	public void setSpec(Spec subject) {
		this.spec = subject;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", Spec=" + spec + "]";
	}
	
	
		
}
