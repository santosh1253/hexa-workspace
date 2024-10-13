package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda01 {
	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,-33,-4,-1,5,6);
		Consumer<Integer> c=System.out::println;
		Runnable r=()->System.out.println("Hello"); 
		r.run();
		Predicate<Integer> p=Lambda01::myfunc;
		List<Integer> x=l.stream().filter(p).toList();
		x.forEach(System.out::println);
	}
	public static boolean myfunc(int x)
	{
		if(x>0)return true;return false;
	}
	

}
