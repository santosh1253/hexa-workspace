package Compartor;

import java.util.ArrayList;
import java.util.Collections;

public class Base {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("Guru",1));
		al.add(new Employee("bavan",4));
		al.add(new Employee("Ram",3));
		// if we want to sort a user defined Objects we will use any of the attribute to sort
		// In such cases it should implement Comparable (Overriding compareTo()) interface.
		// Else we can sort by passing comparator (overriding compare()) to sort method
		Collections.sort(al,new MyComparator());
		//Collections.sort(al);
		
		for(Employee e:al)
		  System.out.println(e.getId()+" "+e.getName());
	}



}