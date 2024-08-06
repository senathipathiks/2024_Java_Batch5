package srienath.Junit;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
public class AgeVerification {
	public String checkEligiblity(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Not Eligible");
		}
		else {
			return("Eligible");
		}
		
	}

}