package ArraysAndString;
import java.util.*;

public class DuplicateInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		char ch[] = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			ch[i] = s.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(i==j) {
					continue;
				}
				
				if(ch[i]==ch[j] && ch[j] != '1') {
					System.out.println(ch[j]);
					ch[j]= '1';
					ch[i]= '1';
				}
			}
		}
		
	}

}
