package com.springboot.assessment2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "student")
public class Student 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private String sage;
	@Column
	private String sgender;
	@Column
	private String standard;
	@Column
	private String emis;
	
	@OneToOne (targetEntity = Admission.class, cascade = CascadeType.ALL)
	private Admission admission;

	public Student() 
	{
		super();
	}

	public Student(int sid, String sname, String sage, String sgender, String standard, String emis,
			Admission admission) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sgender = sgender;
		this.standard = standard;
		this.emis = emis;
		this.admission = admission;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSage() {
		return sage;
	}

	public void setSage(String sage) {
		this.sage = sage;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getEmis() {
		return emis;
	}

	public void setEmis(String emis) {
		this.emis = emis;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sgender=" + sgender + ", standard="
				+ standard + ", emis=" + emis + ", admission=" + admission + "]";
	}	
}
