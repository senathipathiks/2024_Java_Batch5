package employee;
//plain old java object - POJO
//Java bean or Model or POJO class
//bean is a collection of public private getter and setter also 
//the purpose of bean class is to store the data in single box
public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private int dno;

//	public static void main(String[] args) {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double salary, int dno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}
	public void display()
	{
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Dept no : "+dno);
		
	}

}
