package strings;

public class Constructor {
int a;
int b;
public Constructor()
{
	System.out.println("From constructor");
}
public Constructor(int a,int b)
{
	this.a=a;
	this.b=b;
	System.out.println(a+b);
}
public Constructor(int a,double b)
{
	System.out.println(a+b);
}
public static void main(String[] args) {
	Constructor ob=new Constructor(5,6);
	Constructor ob1=new Constructor(5,6.0);
	System.out.println(ob.a+" "+ob.b);
}
}
