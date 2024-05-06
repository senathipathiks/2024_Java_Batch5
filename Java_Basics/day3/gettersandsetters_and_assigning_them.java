package day3;

class Employee4 {
	private int eno; // we should put private because to achieve the encapsulation
	private String name;
	
//	right click-> source-> getters and setters
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee4 [eno=" + eno + ", name=" + name + "]";
	} // right click-> source-> generatetoString

}

public class gettersandsetters_and_assigning_them {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 obj4 = new Employee4();
		obj4.setName("Prabha");
		obj4.setEno(121);
		System.out.println(obj4);

	}

}
