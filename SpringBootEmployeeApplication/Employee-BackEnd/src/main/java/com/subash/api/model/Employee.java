package com.subash.api.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private String age;
	
	@Column(name="desig")
	private String desig;
	
	@Column(name="dept")
	private String dept;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Payroll payroll;
	
//	@OneToMany(targetEntity = Account.class,cascade = CascadeType.ALL)
//	@JoinColumn(name="Employee_ID") // this line for avoid the third mapping table creation for user,mobile
//	private List<Account> account = new ArrayList<>();
	
//	@OneToMany(targetEntity = Payroll.class,cascade = CascadeType.ALL)
//	@JoinColumn // this line for avoid the third mapping table creation for user,mobile
//	private List<Payroll> payroll = new ArrayList<>();
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String age, String desig, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.desig = desig;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	
	

//	public List<Account> getAccount() {
//		return account;
//	}
//
//	public void setAccount(List<Account> account) {
//		this.account = account;
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desig=" + desig + ", dept=" + dept + "]";
	}

//	public List<Payroll> getPayroll() {
//		return payroll;
//	}
//
//	public void setPayroll(List<Payroll> payroll) {
//		this.payroll = payroll;
//	}
	
	
	

	
	
	
}
