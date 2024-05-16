package Day3;

class Employee{

	private int id;
	private String Ename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String string) {
		Ename = string;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(122);
		e.setEname("Velan");
		System.out.println(e.getId()+" : "+e.getEname());
	}
	
}
