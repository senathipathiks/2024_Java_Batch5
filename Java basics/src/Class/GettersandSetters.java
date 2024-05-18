package Class;

class Employee4
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee4 [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}

public class GettersandSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Employee4 obj1 = new Employee4();
		obj1.setName("Madhan");
		obj1.setRollno(121);
		System.out.println(obj1);

	}
}

	
