package Spring.eg2;

public class Student 
{
	private int Rno;
	private String Name;
	private int Mark1;
	private int Mark2;
	private int Mark3;
	
	public Student() 
	{
		super();		
	}

	public Student(int rno, String name, int mark1, int mark2, int mark3) 
	{
		super();
		Rno = rno;
		Name = name;
		Mark1 = mark1;
		Mark2 = mark2;
		Mark3 = mark3;
	}

	public int getRno() {
		return Rno;
	}

	public void setRno(int rno) {
		Rno = rno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMark1() {
		return Mark1;
	}

	public void setMark1(int mark1) {
		Mark1 = mark1;
	}

	public int getMark2() {
		return Mark2;
	}

	public void setMark2(int mark2) {
		Mark2 = mark2;
	}

	public int getMark3() {
		return Mark3;
	}

	public void setMark3(int mark3) {
		Mark3 = mark3;
	}

	@Override
	public String toString() 
	{
		return "Student [Rno=" + Rno + ", Name=" + Name + ", Mark1=" + Mark1 + ", Mark2=" + Mark2 + ", Mark3=" + Mark3 + "]";
	}
	
	
}
