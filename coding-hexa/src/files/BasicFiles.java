package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicFiles {
	public static void main(String[] args) throws IOException {
	//Used to write data from java class into files
     FileOutputStream fos=new FileOutputStream("mine.txt");
     fos.write('g');
     fos.write(66);
     fos.write(23);
     fos.close();
     //Read data from files to java class
     FileInputStream fis=new FileInputStream("mine.txt");
     int i;
     while((i=fis.read())!=-1)
     {
    	System.out.println((char)i); 
     }
     
     
	}

}
