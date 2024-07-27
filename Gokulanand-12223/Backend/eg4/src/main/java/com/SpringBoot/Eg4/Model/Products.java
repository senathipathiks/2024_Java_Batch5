package com.SpringBoot.Eg4.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_tbl")
public class Products 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pname;
	@Column
	private String pbrand;
	@Column
	private String quantity;
	@Column
	private String price;
	@Column
	private String pdiscount;
	
	public Products() 
	{
		super();
	}

	public Products(int pname, String pbrand, String quantity, String price, String pdiscount) {
		super();
		this.pname = pname;
		this.pbrand = pbrand;
		this.quantity = quantity;
		this.price = price;
		this.pdiscount = pdiscount;
	}

	public int getPname() {
		return pname;
	}

	public void setPname(int pname) {
		this.pname = pname;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPdiscount() {
		return pdiscount;
	}

	public void setPdiscount(String pdiscount) {
		this.pdiscount = pdiscount;
	}

	@Override
	public String toString() {
		return "Products [pname=" + pname + ", pbrand=" + pbrand + ", quantity=" + quantity + ", price=" + price
				+ ", pdiscount=" + pdiscount + "]";
	}
}
