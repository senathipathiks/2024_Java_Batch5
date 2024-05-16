package com.lms.bean;

public class pdt {

	int pdtId;
	 String pdtName;
	 String pdtBrand;
	 String pdtCategory;
	 
	public pdt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public pdt(int pdtId, String pdtName, String pdtBrand, String pdtCategory) {
		super();
		this.pdtId = pdtId;
		this.pdtName = pdtName;
		this.pdtBrand = pdtBrand;
		this.pdtCategory = pdtCategory;
	}

	public int getpdtId() {
		return pdtId;
	}

	public void setpdtId(int pdtId) {
		this.pdtId = pdtId;
	}

	public String getpdtName() {
		return pdtName;
	}

	public void setpdtName(String pdtName) {
		this.pdtName = pdtName;
	}

	public String getpdtBrand() {
		return pdtBrand;
	}

	public void setpdtBrand(String pdtBrand) {
		this.pdtBrand = pdtBrand;
	}

	public String getpdtCategory() {
		return pdtCategory;
	}

	public void setpdtCategory(String pdtCategory) {
		this.pdtCategory = pdtCategory;
	}

	public static void main(String[] args) {
		 

	}


}
