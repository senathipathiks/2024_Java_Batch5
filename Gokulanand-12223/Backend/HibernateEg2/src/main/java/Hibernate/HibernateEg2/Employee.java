package Hibernate.HibernateEg2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_tbl")
public class Employee 
{
	@Id
	int empid;
	@Column
	String empname;
	@Column
	String empdesig;
	@Column 
	String empdept;
	
	public Employee() 
	{
		super();
	}

	public Employee(int empid, String empname, String empdesig, String empdept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesig = empdesig;
		this.empdept = empdept;
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

	public String getEmpdesig() {
		return empdesig;
	}

	public void setEmpdesig(String empdesig) {
		this.empdesig = empdesig;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdesig=" + empdesig + ", empdept=" + empdept
				+ "]";
	}	
}
