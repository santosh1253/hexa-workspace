package Compartor;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		SortedSet<Employee> s=new TreeSet<Employee>(new SortByName());
		s.add(new Employee("Guru",594));
		s.add(new Employee("Usha",568));
		s.add(new Employee("Harsha",534));
		//System.out.println(s);
		for(Employee e:s)
		{
			System.out.println(e.getId()+" "+e.getName());
		}
		Iterator<Employee> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getId());
		}
	}

}
