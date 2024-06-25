package com.srienath.restapp.model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="petshop")
public class PetShop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="psid")
	private int psid;
	@Column(name="psname")
	private String psname;
	@Column(name="psaddress")
	private String psaddress;
	@Column(name="psemail")
	private String psemail;
	@Column(name="psdesc")
	private String psdesc;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Pets pets;

	public int getPsid() {
		return psid;
	}

	public void setPsid(int psid) {
		this.psid = psid;
	}

	public String getPsname() {
		return psname;
	}

	public void setPsname(String psname) {
		this.psname = psname;
	}

	public String getPsaddress() {
		return psaddress;
	}

	public void setPsaddress(String psaddress) {
		this.psaddress = psaddress;
	}

	public String getPsemail() {
		return psemail;
	}

	public void setPsemail(String psemail) {
		this.psemail = psemail;
	}

	public String getPsdesc() {
		return psdesc;
	}

	public void setPsdesc(String psdesc) {
		this.psdesc = psdesc;
	}

	public Pets getPets() {
		return pets;
	}

	public void setPets(Pets pets) {
		this.pets = pets;
	}

	public PetShop(int psid, String psname, String psaddress, String psemail, String psdesc, Pets pets) {
		super();
		this.psid = psid;
		this.psname = psname;
		this.psaddress = psaddress;
		this.psemail = psemail;
		this.psdesc = psdesc;
		this.pets = pets;
	}

	public PetShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
