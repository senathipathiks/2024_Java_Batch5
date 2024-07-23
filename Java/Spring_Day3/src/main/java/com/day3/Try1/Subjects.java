package com.day3.Try1;

public class Subjects {
	int tam;
	int eng;
	
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subjects(int tam, int eng) {
		super();
		this.tam = tam;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Subjects [tam=" + tam + ", eng=" + eng + "]";
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
