package day8_StreamsJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Img {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\vashanth.thoppey\\Downloads\\men.png");
        FileOutputStream fout = new FileOutputStream("D:\\ImgFile.png");
        int ch;
        while((ch=fin.read())!=-1) {
//      	  System.out.println((char)ch);
      	  fout.write((char)ch);
        }
        System.out.println("Task Completed");
        fin.close();
        fout.close();
	}

}
