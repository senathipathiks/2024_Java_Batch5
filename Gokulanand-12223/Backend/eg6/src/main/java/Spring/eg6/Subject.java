package Spring.eg6;

public class Subject 
{
	int English;
	int Tamil;
	int Maths;
	int Science;
	int SocialScience;
	
	public Subject() 
	{
		super();
	}

	public Subject(int english, int tamil, int maths, int science, int socialScience) {
		super();
		English = english;
		Tamil = tamil;
		Maths = maths;
		Science = science;
		SocialScience = socialScience;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getTamil() {
		return Tamil;
	}

	public void setTamil(int tamil) {
		Tamil = tamil;
	}

	public int getMaths() {
		return Maths;
	}

	public void setMaths(int maths) {
		Maths = maths;
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int science) {
		Science = science;
	}

	public int getSocialScience() {
		return SocialScience;
	}

	public void setSocialScience(int socialScience) {
		SocialScience = socialScience;
	}

	@Override
	public String toString() {
		return "English " + English + " ,Tamil " + Tamil + " ,Maths " + Maths + " ,Science " + Science + " ,Social Science " + SocialScience; 

	}
	
	
	
	
	
}
