package strings;
class A
{
	int a=5;
	public void hello()
	{
		System.out.println("hello....from A");
	}
}
class B extends A
{
	int a=7;
	public void hello()
	{
		System.out.println("hello....from B");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		A ob=new B();
		ob.hello();
		System.out.println(ob.a);
	}
}
