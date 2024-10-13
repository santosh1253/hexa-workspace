package inheritance;

public class Father {
	int age;
	String name;
	protected Father()
	{
	}
	protected Father(int a,String n)
	{
		age=a;
		name=n;
	}
	public void show()
	{
		System.out.println("From Parent class show method");
	}
	public void display()
	{
		System.out.println("From parent class display method");
		System.out.println(age+" "+name);
	}
}
