package Spring.eg9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Faculty 
{
	@Value("101")
	int facid;
	@Value("Samantha")
	String facname;
	
	@Autowired
	private Subject subject;

	public Faculty() 
	{
		super();
	}

	public Faculty(int facid, String facname, Subject subject) {
		super();
		this.facid = facid;
		this.facname = facname;
		this.subject = subject;
	}

	public int getFacid() {
		return facid;
	}

	public void setFacid(int facid) {
		this.facid = facid;
	}

	public String getFacname() {
		return facname;
	}

	public void setFacname(String facname) {
		this.facname = facname;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void display()
	{
		System.out.println("Faculty Id : " + facid);
		System.out.println("Faculty Name : " + facname);
		System.out.println("Faculty Subject Id : " + subject.subid);
		System.out.println("Faculty Subject Name : " + subject.subname);
	}	
}
