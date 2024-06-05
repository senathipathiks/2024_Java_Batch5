package TaskStudtSub;

public class Subject {
	
	int s1,s2,s3,s4,s5;

	public Subject() {
		super();
		
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public int getS3() {
		return s3;
	}

	public void setS3(int s3) {
		this.s3 = s3;
	}

	public int getS4() {
		return s4;
	}

	public void setS4(int s4) {
		this.s4 = s4;
	}

	public int getS5() {
		return s5;
	}

	public void setS5(int s5) {
		this.s5 = s5;
	}

	@Override
	public String toString() {
		return "Exam Marks! [Tamil : " + s1 + ", English : " + s2 + ", Maths : " + s3 + ", Science : " + s4 + ", Social : " + s5 + "]";
	}
	
	
}
