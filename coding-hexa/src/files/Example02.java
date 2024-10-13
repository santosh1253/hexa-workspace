package files;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Example02 {

	public static void main(String[] args) throws IOException {
		// Writing data into a file using PrintWriter objs
		PrintWriter pw=new PrintWriter(new FileWriter("guru.txt"));
		pw.write("Hello");
		pw.write("How are you");
		pw.print(90.6);
		pw.print(pw);
		pw.close();
		
		FileInputStream fis=new FileInputStream("guru.JPG");
		int x=fis.read();
		while(x!=-1)
		{
			System.out.print((char)fis.read());
			x=fis.read();
		}
		
		
		
	}

}
