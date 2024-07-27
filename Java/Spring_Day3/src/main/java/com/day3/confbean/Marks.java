package com.day3.confbean;

public class Marks {
	int tam;
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
