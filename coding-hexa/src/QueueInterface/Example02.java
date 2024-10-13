package QueueInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Example02 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1,1);
		hm.put(1,2);
		//2 4 1
		hm.put(2,1);
	    for(Map.Entry<Integer, Integer> m:hm.entrySet())
	    {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
	    
	    ArrayList<Integer> al=new ArrayList<>();
	    al.add(5);
	    al.add(7);
	    al.add(8);
	    al.add(10);
	    al.add(4);
	    System.out.println(Collections.min(al));

	}

}
