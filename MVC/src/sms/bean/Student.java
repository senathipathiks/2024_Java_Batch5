package sms.bean;

public class Student {

	int stdid;
	String stdname;
	String dept;
	int totmarks;
	
	public Student() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public Student(int stdid, String stdname, String dept, int totmarks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.dept = dept;
		this.totmarks = totmarks;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getTotmarks() {
		return totmarks;
	}

	public void setTotmarks(int totmarks) {
		this.totmarks = totmarks;
	}

	
	
	
	
	
}
