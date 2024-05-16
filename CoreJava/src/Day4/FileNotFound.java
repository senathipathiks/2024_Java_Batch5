package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin =new FileInputStream("D://ne.txt");
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		try {
			Class class1=Class.forName("Bank");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found");
		}
	}

}
