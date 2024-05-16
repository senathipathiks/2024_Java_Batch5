package Day2;

public class GeneratePin {

	public static void main(String[] args) {
		
		String fn="Velan";
		String ln="Chelladurai";
		String an="987654321234";
		String pn="VELA1234N";
		String dob="26-oct-2002";
		String pin="";
	    
		String ln1=ln.substring(ln.length()-2,ln.length());
		ln1=ln1.toUpperCase();
		
		String fn1=fn.substring(0,3);
        fn1=fn1.toLowerCase();
		
        String an1=an.substring(4,8);
		String pn1=pn.substring(4,8);
		String dob1=dob.substring(3,6);
		
		pin+=ln1+fn1+an1+pn1+dob1;
		System.out.println(pin);
		
	}

}
