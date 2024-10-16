package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) throws Exception {

		// inserting data into file using BufferedReader
		BufferedWriter bw = new BufferedWriter(new FileWriter("guru.txt"));
		bw.write("This is"); // -->inserting a string
		bw.newLine();
		bw.write("Guru Datta with rollno");
		bw.newLine();
		bw.write(94); // --> used to insert a char
		bw.flush(); // -->used to add any leftover contents
		bw.close();
		
		// Reading or fetching data from file
		BufferedReader br = new BufferedReader(new FileReader("guru.txt"));
		String line;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();

	}

}
