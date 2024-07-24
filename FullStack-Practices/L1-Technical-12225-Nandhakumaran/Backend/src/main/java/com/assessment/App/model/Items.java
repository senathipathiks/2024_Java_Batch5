package com.assessment.App.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemtable")
public class Items {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "items_id")
    private int itemsId;
    
    private int Cappuccino;
    
    private int Latte;
    
    private int Mocha;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int itemsId, int cappuccino, int latte, int mocha) {
		super();
		this.itemsId = itemsId;
		Cappuccino = cappuccino;
		Latte = latte;
		Mocha = mocha;
	}

	public int getItemsId() {
		return itemsId;
	}

	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}

	public int getCappuccino() {
		return Cappuccino;
	}

	public void setCappuccino(int cappuccino) {
		Cappuccino = cappuccino;
	}

	public int getLatte() {
		return Latte;
	}

	public void setLatte(int latte) {
		Latte = latte;
	}

	public int getMocha() {
		return Mocha;
	}

	public void setMocha(int mocha) {
		Mocha = mocha;
	}

	@Override
	public String toString() {
		return "Items [itemsId=" + itemsId + ", Cappuccino=" + Cappuccino + ", Latte=" + Latte + ", Mocha=" + Mocha
				+ "]";
	}
    
    
    

}
