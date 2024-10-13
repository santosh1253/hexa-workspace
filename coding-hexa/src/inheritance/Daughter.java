package inheritance;

public class Daughter extends Father{
  public static void main(String[] args) {
	Father f1=new Daughter();
	Father f2=new Son();
	Father f3=new Father();
	Daughter d=(Daughter)(f1);
	try
	{
	d=(Daughter)f1;
	System.out.println(d);
	}
	catch(ClassCastException e)
	{
		Son s=(Son)f2;
		System.out.println(s.toString());
		e.printStackTrace();
	}
	
}
}
