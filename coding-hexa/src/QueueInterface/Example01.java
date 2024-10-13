package QueueInterface;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Example01 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		HashMap<Integer,String> hm=new HashMap();
		q.add(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);
	//	q.offer(70);
		q.add(5);
		q.remove();
		System.out.println(q.peek()+" "+q);
		
		hm.put(1, "Guru");
		hm.put(2, "Datta");
		hm.put(3,"Konkimalla");
		hm.put(4, "Rahul");
		HashMap<Integer,String> hm1=new HashMap();
		hm1.put(4, "Raju");
		System.out.println(hm);
		// Converting map into set and accessing using forEachloop
		Set<Entry<Integer, String>> m1=hm.entrySet();
		for(Entry<Integer,String> m:m1)
		{
			System.out.println(m);
		}
		Set<Integer> s=hm.keySet();

	}

}
