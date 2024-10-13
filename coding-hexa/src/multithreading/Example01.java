package multithreading;

import java.util.ArrayList;

public class Example01 extends Thread{

	//Vector<Integer> al=new Vector<Integer>();
	ArrayList<Integer> al=new ArrayList<Integer>();
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			al.add(i);
			System.out.println(i+" by "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Example01 t1=new Example01();
		t1.start();
		Example01 t2=new Example01();
		t2.start();
		
	}

}
