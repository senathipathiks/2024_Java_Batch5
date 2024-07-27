package Spring.eg9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject 
{
	@Value("20EE101")
	String subid;
	@Value("Economics")
	String subname;
	
	public Subject() 
	{
		super();
	}

	public Subject(String subid, String subname) {
		super();
		this.subid = subid;
		this.subname = subname;
	}

	public String getSubid() {
		return subid;
	}

	public void setSubid(String subid) {
		this.subid = subid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subname=" + subname + "]";
	}	
	
	
}
