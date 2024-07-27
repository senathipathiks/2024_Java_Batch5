package com.day3.ComponentAnno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Marks {
	@Value("98")
	int tam;
	@Value("86")
	int eng;
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marks(int tam, int eng) {
		super();
		this.tam = tam;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Marks [tam=" + tam + ", eng=" + eng + "]";
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
