package Exceptions;

import java.util.Scanner;

class FileTypeCheckException extends Exception{
	FileTypeCheckException(String str){
		super(str);
	}
}
public class FileTypeException {

	static void validate(String files) throws FileTypeCheckException{
		
				String types[] = {"pdf","docx","jpeg","png"};
				int flag =0;
				System.out.println(files);
				
	            String ss[] = files.split("\\.");
	            String t = ss[1];
	            
	            for(int i=0;i<types.length;i++) {
	            	if(types[i].equals(t)) {
	            		flag =1;
	            	}
	            }
	            
	            if(flag == 0) {
	            	throw new FileTypeCheckException("Invlaid file type");
	            } else {
	            	System.out.println("File accepted");
	            }
	            
	     }
	
		public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file");
		String file = sc.nextLine();
		try {
			
		   validate(file);
		}
		catch(FileTypeCheckException e) {
			System.out.println(e);
		}

	}

}