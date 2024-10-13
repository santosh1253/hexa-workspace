package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Example02 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		Thread t1=new Thread()
		{
		  public void run()
		  {
			  for(int i=0;i<10;i++)
			  {
				  al.add(i);
			  }
			  System.out.println(al);
		  }
		};
		Thread t2=new Thread()
		{
		  public void run()
		  {
			  for(int i=0;i<20;i++)
			  {
				  al.add(i);
			  }
			  System.out.println(al);
		  }
		};
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(al);
		System.out.println("al is:"+al);
	}

}
