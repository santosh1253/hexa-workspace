package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class SecondFile {

	public static void main(String[] args) throws IOException {
		Writer writer=new FileWriter("santos.txt");
		BufferedWriter bw=new BufferedWriter(writer);
		bw.write("Hello");
		bw.write("How are you");
		bw.write("Bye");
		bw.close();
		Reader reader=new FileReader("santos.txt");
		BufferedReader br=new BufferedReader(reader);
		String x;
		while((x=br.readLine())!=null)
		{
         System.out.println(x);
		}
		br.close();
	}
}
