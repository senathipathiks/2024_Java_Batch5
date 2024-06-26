package com.visitor.beans;

//This is the Bean class to store details and declare Variables

public class Visitors {
	private int vid;
	private String vname;
	private String vph;
	private String vpurpose;
	private String vaddress;
	private String emp_name;
	private String emp_desig;

	
	public Visitors() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Visitors(int vid, String vname, String vph, String vpurpose, String vaddress, String emp_name,
			String emp_desig) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vph = vph;
		this.vpurpose = vpurpose;
		this.vaddress = vaddress;
		this.emp_name = emp_name;
		this.emp_desig = emp_desig;
	}


	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVph() {
		return vph;
	}
	public void setVph(String vph) {
		this.vph = vph;
	}
	public String getVpurpose() {
		return vpurpose;
	}
	public void setVpurpose(String vpurpose) {
		this.vpurpose = vpurpose;
	}
	public String getVaddress() {
		return vaddress;
	}
	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_desig() {
		return emp_desig;
	}
	public void setEmp_desig(String emp_desig) {
		this.emp_desig = emp_desig;
	}
	
	
}

