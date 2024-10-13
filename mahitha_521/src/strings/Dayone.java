package strings;

import java.util.Set;
import java.util.TreeMap;

public class Dayone {
 public static void main(String[] args) {
//	 System.out.println("hello");
	 TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();         
	 tree_map.put(10, "Geeks");   
     tree_map.put(15, "4");   
     tree_map.put(20, "Geeks");      
     tree_map.put(25, "Welcomes");    
     tree_map.put(30, "You");       
    Set<Integer> s1=tree_map.keySet();   
    System.out.println(s1);
   System.out.println("Key  ----  Value");    
    for(Integer x:s1)     
   {       
     System.out.println(x+"   "+tree_map.get(x));      
  }          
  }

 }
