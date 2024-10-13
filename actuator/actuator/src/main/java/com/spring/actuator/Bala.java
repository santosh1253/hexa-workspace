package com.spring.actuator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Bala {
	
	public static void main(String[] args) {
		int a=5;
		float b=6.4f;
		char c='A';
		// Autoboxing --> converting primitive data types to 
		// Wrapper class (Objects)
		Integer x=a;
		Integer y=56;
		
		int z=x.intValue();  // Unboxing
		System.out.println(z);
		
		
		//ArrayList<Wrapperclass> obj_name=new ArrayList<Wrapper>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(x);
		al.add(y);
		al.add(66);
		al.add(69);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		for(Integer ob:al)
		{
			System.out.println(ob);
		}
		ListIterator<Integer> it=al.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//System.out.println(al);
		
		
		
		
		
		
		
		
		
		
	}

}
