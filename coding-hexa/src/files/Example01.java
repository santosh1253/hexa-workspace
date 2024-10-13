package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Example01 {

	public static void main(String[] args) throws Exception {
		// creating a file and inserting data into fileWriter class
		File f = new File("img.jpg");
		f.createNewFile();
		System.out.println(f.exists());
		FileWriter fw = new FileWriter(f);
		fw.write("Guru");
		fw.write(300);
		fw.write("Datta");
		fw.flush();
		fw.close();
		// Reading Data using FileReader class
		FileReader fr = new FileReader("IMG_0929(2).jpg");
//		while (fr.ready()) {
//			System.out.println((char) fr.read());
//		}
		int x=fr.read();
		while(x!=-1)
		{
			System.out.print((char)x);
			x=fr.read();
		}

	}

}
