package mypackage;

class Example01 {
	
	int m=10;
	int n;
	public Example01()
	{
	  m=20;
	  System.out.println(m+" "+n);
	}
	public Example01(int value)
	{
	  m=value;
	  System.out.println(m+" "+n);
	}
	public Example01(int v1,int v2)
	{
		m=v1;
		n=v2;
		System.out.println(m+" "+n);
	}
	public void few()
	{
	  m=40;
	  System.out.println(m+" "+n);
	}
	public static void main(String args[]) {
		Example01 ab = new Example01(100,50);
	}
}