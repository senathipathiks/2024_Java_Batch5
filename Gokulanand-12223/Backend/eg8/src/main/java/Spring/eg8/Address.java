package Spring.eg8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
	@Value("350")
	int doorno;
	@Value("Nungambakkam")
	String area;
	@Value("Chennai")
	String city;
	
	public Address() 
	{
		super();
	}

	public Address(int doorno, String area, String city) {
		super();
		this.doorno = doorno;
		this.area = area;
		this.city = city;
	}

	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", area=" + area + ", city=" + city + "]";
	}	
	
}
