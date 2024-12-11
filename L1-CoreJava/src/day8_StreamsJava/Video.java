package day8_StreamsJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Video {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\vashanth.thoppey\\Downloads\\4763824-uhd_3840_2160_24fps.mp4");
        FileOutputStream fout = new FileOutputStream("D:\\vdo.mp4");
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
