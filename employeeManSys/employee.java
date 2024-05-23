package employeeManSys;
//bean class
public class employee {
	 private int eid;
	 private String ename;
	 private double esalary;
	 private int dno;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int eid, String ename, double esalary, int dno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.dno = dno;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public void display() {
		System.out.println("Employee Id: " + eid);
		System.out.println("Employee name: " + ename);
		System.out.println("Employee salary: " + esalary);
		System.out.println("Employee Dept no : " + dno);

	}
	 
	 
}
