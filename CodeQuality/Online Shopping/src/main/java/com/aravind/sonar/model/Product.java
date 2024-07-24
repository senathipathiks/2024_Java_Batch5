package com.aravind.sonar.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	@Column(name="Product Name")
	private String pname;
	
	@Column(name="Product Price")
	private String pprice;
	
	@OneToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
	private Order order;

	public Product() {
		super();
		
	}

	public Product(int pid, String pname, String pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", order=" + order + "]";
	}
	
	
	

	
	
	
	
	
	
}
