package multithreading;

import java.util.HashMap;

public class HashingExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Guru");
		hm.put(1, "Santosh");
		hm.put(2, "Datta");
		hm.put(3, "Rowdy");
		for(Integer x:hm.keySet())
		{
			System.out.println(x+" "+hm.get(x));
		}
	}

}
