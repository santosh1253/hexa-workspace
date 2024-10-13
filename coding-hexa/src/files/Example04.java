package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Compartor.Employee;

public class Example04 {
	
	public static void main(String[] args) throws Exception {
		// Serialization --> converting obj data into n/w supported data 
		FileOutputStream fos=new FileOutputStream("obj.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee("raju",99);
		Employee e1=new Employee("Ram",97);
		oos.writeObject(e);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		//Deserialization -->converting data in n/w to a object format
		FileInputStream fis=new FileInputStream("obj.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee s=(Employee)ois.readObject();
        System.out.println(s.getName()+" "+s.getId());
        s=(Employee)ois.readObject();
        System.out.println(s.getName()+" "+s.getId());
        
        
	}

}
