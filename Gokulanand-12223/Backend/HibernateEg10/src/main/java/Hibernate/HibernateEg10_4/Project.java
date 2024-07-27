package Hibernate.HibernateEg10_4;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_tbl")
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projid;
	private String projname;
	
	@ManyToMany(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Employee> emplist;

	public Project() 
	{
		super();
	}

	public Project(int projid, String projname, List<Employee> emplist) {
		super();
		this.projid = projid;
		this.projname = projname;
		this.emplist = emplist;
	}

	public int getProjid() {
		return projid;
	}

	public void setProjid(int projid) {
		this.projid = projid;
	}

	public String getProjname() {
		return projname;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
}
