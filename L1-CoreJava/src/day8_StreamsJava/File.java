package day8_StreamsJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//              FileInputStream fin = new FileInputStream("D:\\FileDemo.txt");
//              FileOutputStream fout = new FileOutputStream("D:\\DemoFile.txt");
              FileReader fr = new FileReader("D:\\DemoFile.txt");
              FileWriter fw= new FileWriter("D:\\FileDemo.txt");
              
              
              int ch;
              while((ch=fr.read())!=-1) {
            	  System.out.println((char)ch);
            	  fw.write((char)ch);
              }
              System.out.println("Task Completed");
             
              fw.close();
              fr.close();
	}

}
