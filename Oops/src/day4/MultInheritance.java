package day4;

interface one {
	int a = 10;
}

interface two{
	int b = 20;
}



class Addition implements one, two {
	public void addition() {
		System.out.println(a + b);
	}
}

public class MultInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		obj.addition();
	}

}
