package Hibernate.HibernateEg10_4;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employee_tbl")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String empname;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "emplist")
	private List<Project> projlist;

	public Employee() 
	{
		super();
	}

	public Employee(int empid, String empname, List<Project> projlist) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.projlist = projlist;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<Project> getProjlist() {
		return projlist;
	}

	public void setProjlist(List<Project> projlist) {
		this.projlist = projlist;
	}	
}
