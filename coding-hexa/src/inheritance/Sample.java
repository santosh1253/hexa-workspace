package inheritance;

public class Sample {
	private int id;
	private String name;
	//Default constructor
	Sample()
	{
		int a=5;
		int b=6;
	 System.out.println("Result is "+(a+b));
	 System.out.println(id+" "+name);
	}
	// Double Parameterized constructor
	Sample(int a,String b)
	{
	 System.out.println(a+" "+b);	
	}
	// Single param constructor
	Sample(int a)
	{
		System.out.println(a);
	}
	//To print the instance variables
	public void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Sample s=new Sample(6,"Santosh");
		Sample s1=new Sample(7);
		Sample s2=new Sample();
		//s.display();
	}

}
