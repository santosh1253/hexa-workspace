package Compartor;

@FunctionalInterface
interface inter
{
	void f1();
	default void m2() {
		System.out.println("Hello");
	}
	public static void m3()
	{
		System.out.println("Method m3");
	}
}
public class My implements inter {
	
	public static void main(String args[])
	{
		inter.m3();
		inter i=()->{
			System.out.println("Lambda Expresssion");
		};
		i.f1();
		
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	
//	public void m2()
//	{
//		System.out.println("M2 from child");
//	}
	 
}
 