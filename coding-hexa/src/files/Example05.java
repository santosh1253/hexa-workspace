package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example05 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("gurud.JPG");
		FileInputStream fis=new FileInputStream("result.JPG");
		int cursor;
		 while((cursor = fis.read())!=-1){
	            fos.write(cursor);
	         //   System.out.println(cursor);
	        }
		

	}

}
